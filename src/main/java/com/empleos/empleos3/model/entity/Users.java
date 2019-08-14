package com.empleos.empleos3.model.entity;




import com.empleos.empleos3.model.utils.EncrytedPasswordUtils;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private int active;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @OneToOne
    private Empresa empresa;
    @OneToOne
    private Campus campus;
    public Users() {
    }

    public Users(Users users) {
        this.active=users.getActive();
        this.email=users.getEmail();
        this.roles = users.getRoles();
        this.name =users.getName();
        this.id=users.getId();
        this.password=users.getPassword();
    }

    public Users(String email, String password, String name, int active, Set<Role> roles, Empresa empresa, Campus campus) {
        this.email = email;
        this.password = EncrytedPasswordUtils.encrytePassword(password);
        this.name = name;
        this.active = active;
        this.roles = roles;
        this.empresa = empresa;
        this.campus = campus;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = EncrytedPasswordUtils.encrytePassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
