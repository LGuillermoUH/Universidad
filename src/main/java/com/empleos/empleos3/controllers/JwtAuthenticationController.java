package com.empleos.empleos3.controllers;

import com.empleos.empleos3.config.JwtTokenUtil;
import com.empleos.empleos3.model.dao.IUsersDao;
import com.empleos.empleos3.model.entity.JwtRequest;
import com.empleos.empleos3.model.entity.JwtResponse;
import com.empleos.empleos3.model.entity.Users;
import com.empleos.empleos3.model.service.CustomUserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private CustomUserDetailService userDetailsService;

	@Autowired
	private IUsersDao usersDao;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
		int valid = usersDao.findByEmail(authenticationRequest.getUsername()).getActive();
		if(valid==0){
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User Invalid, please wait for authentication");
		}else{


			final UserDetails userDetails = userDetailsService
					.loadUserByUsername(authenticationRequest.getUsername());

			final String token = jwtTokenUtil.generateToken(userDetails);
			Users users= usersDao.findByEmail(authenticationRequest.getUsername());
			return ResponseEntity.ok(new JwtResponse(token, users));
		}
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}