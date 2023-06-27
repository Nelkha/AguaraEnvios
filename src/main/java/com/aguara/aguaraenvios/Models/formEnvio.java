
package com.aguara.aguaraenvios.Models;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class formEnvio extends Comprobante {
private String domicilioRemitente;
private String localidadRemitente;
private String condIva;
ArrayList<String>condVenta;
@OneToMany(cascade = CascadeType.ALL)
ArrayList<Bulto>bultos;

    public formEnvio(String domicilioRemitente, String localidadRemitente, ArrayList<Bulto> bultos, long idComprobante, Date fecha, String remitente, String destinatario, String cuitDestinatario, Localidad localidadDestinatario, String domicilioDestinatario, String telefonoDestinatario, double importeAPagar, String observaciones) {
        super(idComprobante, fecha, remitente, destinatario, cuitDestinatario, localidadDestinatario, domicilioDestinatario, telefonoDestinatario, importeAPagar, observaciones);
        this.domicilioRemitente = domicilioRemitente;
        this.localidadRemitente = localidadRemitente;
        this.bultos = new ArrayList<>();
    }

    public String getDomicilioRemitente() {
        return domicilioRemitente;
    }

    public void setDomicilioRemitente(String domicilioRemitente) {
        this.domicilioRemitente = domicilioRemitente;
    }

    public String getCondIva() {
        return condIva;
    }

    public void setCondIva(String condIva) {
        this.condIva = condIva;
    }



   
    
    @Override
    public double calcularImporte(Comprobante comprobante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
