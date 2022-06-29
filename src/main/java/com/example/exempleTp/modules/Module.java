package com.example.exempleTp.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Module  {
    @Id
    private int id;
    private String nom;
    private String description;
    public Module(){}

    public Module(int id, String nom, String description){
        this.id=id;
        this.nom=nom;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
