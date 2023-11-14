package com.colegioeducativo.colegio.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name="apellido", nullable = false, length = 25)
    private String apellido;

    @Column(name="cedula", nullable = false, length = 10)
    private String cedula;

    @Column(name="correo", nullable = true, length = 50)
    private String correo;

    @Column(name="celular", nullable = false, length = 10)
    private String celular;

    @Column(name="rol", nullable = false, length = 50)
    private String rol;

    @Column(name="usuario", nullable = false, length = 50)
    private String usuario;

    @Column(name="contrasenia", nullable = false, length = 255)
    private String contrasenia;
}
