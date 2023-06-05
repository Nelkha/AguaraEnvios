/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguara.aguaraenvios.Models;

/**
 *
 * @author Nelkha
 */
public class Bulto {
    private double peso;
    private String detalles;

    public Bulto(double peso, String detalles) {
        this.peso = peso;
        this.detalles = detalles;
    }

   
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getdetalles() {
        return detalles;
    }

    public void setdetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
}
