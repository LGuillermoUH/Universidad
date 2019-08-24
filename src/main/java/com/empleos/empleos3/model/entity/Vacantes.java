package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Table
@Entity(name = "vacantes")
public class Vacantes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vacantes_id")
    private int vacantesId;
    @Column(name = "nombre_vacantes")
    private String nombreVacante;
    @Column(name = "numero_plazas")
    private int numeroPlazas;
    @Column(name = "genero")
    private String genero;
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "edad")
    private int edad;
    @Column(name = "experiencia")
    private int experiencia;
    @Column(name = "idioma")
    private String idioma;
    @Column(name = "escolaridad")
    private String escolaridad;
    @Column(name = "horario")
    private String horario;
    @Column(name = "dias_lavorales")
    private String diasLavorales;
    @Column(name = "sueldo_base")
    private double sueldoBase;
    @Column(name = "presentacion")
    private String prestaciones;
    @Column(name = "comisiones")
    private String comisiones;
    @Column(name = "tipo_contrato")
    private String tipoContrato;
    @Column(name = "nivel_vacantes")
    private String nivelVacante;
    @Column(name = "opcion_viaje")
    private int opcionViaje;
    @Column(name = "funcion")
    private String Funcion;
    @Column(name = "conocimientos")
    private String conociomientos;
    @Column(name = "habilidades")
    private String habilidades;
    @Column(name = "requisitos_add")
    private String requisitosAdd;
    @Column(name = "logo_empresa")
    private String logoEmpresa;
    @Column(name = "estado")
    private int estado;
    @OneToOne
    private Users users;
    @OneToOne
    private Carreras carreras;

    public Vacantes() {
    }

    public Vacantes(String nombreVacante, int numeroPlazas, String genero, String estadoCivil, int edad, int experiencia, String idioma, String escolaridad, String horario, String diasLavorales, double sueldoBase, String prestaciones, String comisiones, String tipoContrato, String nivelVacante, int opcionViaje, String funcion, String conociomientos, String habilidades, String requisitosAdd, String logoEmpresa, int estado, Users users, Carreras carreras) {
        this.nombreVacante = nombreVacante;
        this.numeroPlazas = numeroPlazas;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.experiencia = experiencia;
        this.idioma = idioma;
        this.escolaridad = escolaridad;
        this.horario = horario;
        this.diasLavorales = diasLavorales;
        this.sueldoBase = sueldoBase;
        this.prestaciones = prestaciones;
        this.comisiones = comisiones;
        this.tipoContrato = tipoContrato;
        this.nivelVacante = nivelVacante;
        this.opcionViaje = opcionViaje;
        Funcion = funcion;
        this.conociomientos = conociomientos;
        this.habilidades = habilidades;
        this.requisitosAdd = requisitosAdd;
        this.logoEmpresa = logoEmpresa;
        this.estado = estado;
        this.users = users;
        this.carreras = carreras;
    }

    public int getVacantesId() {
        return vacantesId;
    }

    public void setVacantesId(int vacantesId) {
        this.vacantesId = vacantesId;
    }

    public String getNombreVacante() {
        return nombreVacante;
    }

    public void setNombreVacante(String nombreVacante) {
        this.nombreVacante = nombreVacante;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiasLavorales() {
        return diasLavorales;
    }

    public void setDiasLavorales(String diasLavorales) {
        this.diasLavorales = diasLavorales;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(String prestaciones) {
        this.prestaciones = prestaciones;
    }

    public String getComisiones() {
        return comisiones;
    }

    public void setComisiones(String comisiones) {
        this.comisiones = comisiones;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNivelVacante() {
        return nivelVacante;
    }

    public void setNivelVacante(String nivelVacante) {
        this.nivelVacante = nivelVacante;
    }

    public int getOpcionViaje() {
        return opcionViaje;
    }

    public void setOpcionViaje(int opcionViaje) {
        this.opcionViaje = opcionViaje;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String funcion) {
        Funcion = funcion;
    }

    public String getConociomientos() {
        return conociomientos;
    }

    public void setConociomientos(String conociomientos) {
        this.conociomientos = conociomientos;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getRequisitosAdd() {
        return requisitosAdd;
    }

    public void setRequisitosAdd(String requisitosAdd) {
        this.requisitosAdd = requisitosAdd;
    }

    public String getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(String logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }
}
