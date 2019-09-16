package com.empleos.empleos3.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "noticia")
public class Noticias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "noticias_id")
    public int noticiasId;
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

    public Noticias() {
    }

    public Noticias(String titulo, int fecha, String suceso, int imagen, Users users) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.suceso = suceso;
        this.imagen = imagen;
        this.users = users;
    }

    public int getNoticiasId() {
        return noticiasId;
    }

    public void setNoticiasId(int noticiasId) {
        this.noticiasId = noticiasId;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
