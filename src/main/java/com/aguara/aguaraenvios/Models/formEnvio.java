
package com.aguara.aguaraenvios.Models;

import java.util.ArrayList;
import java.util.Date;




public class formEnvio extends Comprobante {
private String domicilioRemitente;
private String localidadRemitente;
private String condIva;
ArrayList<String>condVenta;
ArrayList<Bulto>bultos;

    public formEnvio(String domicilioRemitente, String localidadRemitente, String condIva, ArrayList<String> condVenta, ArrayList<Bulto> bultos, long idComprobante, Date fecha, String remitente, String destinatario, String cuitDestinatario, Localidad localidadDestinatario, String domicilioDestinatario, String telefonoDestinatario, double importeAPagar, String observaciones) {
        super(idComprobante, fecha, remitente, destinatario, cuitDestinatario, localidadDestinatario, domicilioDestinatario, telefonoDestinatario, importeAPagar, observaciones);
        this.domicilioRemitente = domicilioRemitente;
        this.localidadRemitente = localidadRemitente;
        this.condIva = condIva;
        this.condVenta = condVenta;
        this.bultos = bultos;
    }



   
    
    @Override
    public double calcularImporte(Comprobante comprobante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
