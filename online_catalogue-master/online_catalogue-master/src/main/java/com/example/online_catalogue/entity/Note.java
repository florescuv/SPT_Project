package com.example.online_catalogue.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    @ManyToOne
    @JoinColumn(name = "cod_disciplina")
    private Discipline disciplina;

    @ManyToOne
    @JoinColumn(name="cod_student")
    private User student;

    @Column(name = "nota")
    private int nota;

    @Column(name = "situatie")
    private String situatie;

    @Column(name = "departament")
    private String departament;

}