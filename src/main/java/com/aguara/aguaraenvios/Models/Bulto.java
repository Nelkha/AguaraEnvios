package com.aguara.aguaraenvios.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Nelkha
 */
@Entity
public class Bulto implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private long idBulto;
    private double peso;
    private String detalles;

    public Bulto(double peso, String detalles) {
        this.peso = peso;
        this.detalles = detalles;
    }

    public long getIdBulto() {
        return idBulto;
    }

    public void setIdBulto(long idBulto) {
        this.idBulto = idBulto;
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
