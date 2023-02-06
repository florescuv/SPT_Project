package com.example.online_catalogue.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class Utilizator {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
