/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ulr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String empresaE;
    private String fechaE;
    private String descripcionE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String empresaE, String fechaE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.fechaE = fechaE;
        this.descripcionE = descripcionE;
    }

    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    
    
}
