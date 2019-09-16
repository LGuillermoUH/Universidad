package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eventos_Id")
    public int eventosId;
    @Column(name = "titulo")
    public String titulo;
    @Column(name = "fecha")
    public int fecha;
    @Column(name = "suceso")
    public String suceso;
    @Column(name = "imagen")
    public int imagen;
    @OneToOne
    public Users users;

    public Eventos() {
    }

    public Eventos(String titulo, int fecha, String suceso, int imagen, Users users) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.suceso = suceso;
        this.imagen = imagen;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getEventosId() {
        return eventosId;
    }

    public void setEventosId(int eventosId) {
        this.eventosId = eventosId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getSuceso() {
        return suceso;
    }

    public void setSuceso(String suceso) {
        this.suceso = suceso;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
