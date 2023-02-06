package com.example.online_catalogue.entity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "studenti")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String email;
    @Column
    private String nume;
    @Column
    private String prenume;
    @Column
    private String parola;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Note> note;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Examene> examene;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    private Utilizator utilizator;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class Inregistrare extends User{
        private String cnfParola;

        public boolean notNull(){
            if(getEmail().equals("")){
                return false;
            }
            if(getNume().equals("")){
                return false;
            }
            if(getPrenume().equals("")){
                return false;
            }
            if(getParola().equals("")){
                return false;
            }

            if(cnfParola.equals("")){
                return false;
            }
            if(!(getParola().equals(cnfParola))) {
                return false;
            }

            return true;
        }

        public User getUser(){
            return User.builder().nume(getNume()).prenume(getPrenume())
                    .email(getEmail()).parola(getParola()).build();
        }
    }


}
