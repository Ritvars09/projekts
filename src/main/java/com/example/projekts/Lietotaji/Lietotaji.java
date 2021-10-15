package com.example.projekts.Lietotaji;


import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Table(name = "Lietotaji")
public class Lietotaji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String epasts;

    @Column(length = 15, nullable = false)
    private String parole;

    @Column(length = 15, nullable = false, name = "vards")
    private String vards;

    @Column(length = 45, nullable = false, name = "Uzvards")
    private String Uzvards;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEpasts() {
        return epasts;
    }

    public void setEpasts(String epasts) {
        this.epasts = epasts;
    }

    public String getParole() {
        return parole;
    }

    public void setParole(String parole) {
        this.parole = parole;
    }

    public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public String getUzvards() {
        return Uzvards;
    }

    public void setUzvards(String uzvards) {
        Uzvards = uzvards;
    }
}
