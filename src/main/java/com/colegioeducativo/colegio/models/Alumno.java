package com.colegioeducativo.colegio.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Alumno extends Persona{
    @Column(name="anioLectivo", nullable = false, length = 50)
    private String anioLectivo;
}
