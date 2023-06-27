package com.aguara.aguaraenvios.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public abstract class Comprobante implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private long idComprobante;
    private Date fecha;
    private String remitente;
    private String destinatario;
    private String cuitDestinatario;
    private Localidad localidadDestinatario;
    private String domicilioDestinatario;
    private String telefonoDestinatario;
    private double importeAPagar;
    private String observaciones;
    private boolean entregado;

    //Constructor
    public Comprobante(long idComprobante, Date fecha, String remitente, String destinatario, String cuitDestinatario, Localidad localidadDestinatario, String domicilioDestinatario, String telefonoDestinatario, double importeAPagar, String observaciones) {
        this.entregado = false;
        this.idComprobante = idComprobante;
        this.fecha = fecha;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.cuitDestinatario = cuitDestinatario;
        this.localidadDestinatario = localidadDestinatario;
        this.domicilioDestinatario = domicilioDestinatario;
        this.telefonoDestinatario = telefonoDestinatario;
        this.importeAPagar = importeAPagar;
        this.observaciones = observaciones;
        
    }

   //GETTERS, SETTERS Y TOSTRING 
    public long getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(long idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCuitDestinatario() {
        return cuitDestinatario;
    }

    public void setCuitDestinatario(String cuitDestinatario) {
        this.cuitDestinatario = cuitDestinatario;
    }

    public Localidad getLocalidadDestinatario() {
        return localidadDestinatario;
    }

    public void setLocalidadDestinatario(Localidad localidadDestinatario) {
        this.localidadDestinatario = localidadDestinatario;
    }

    public String getDomicilioDestinatario() {
        return domicilioDestinatario;
    }

    public void setDomicilioDestinatario(String domicilioDestinatario) {
        this.domicilioDestinatario = domicilioDestinatario;
    }

    public String getTelefonoDestinatario() {
        return telefonoDestinatario;
    }

    public void setTelefonoDestinatario(String telefonoDestinatario) {
        this.telefonoDestinatario = telefonoDestinatario;
    }

    public double getImporteAPagar() {
        return importeAPagar;
    }

    public void setImporteAPagar(double importeAPagar) {
        this.importeAPagar = importeAPagar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "idComprobante=" + idComprobante + ", fecha=" + fecha + ", remitente=" + remitente + ", destinatario=" + destinatario + ", cuitDestinatario=" + cuitDestinatario + ", localidadDestinatario=" + localidadDestinatario + ", domicilioDestinatario=" + domicilioDestinatario + ", telefonoDestinatario=" + telefonoDestinatario + ", importeAPagar=" + importeAPagar + ", observaciones=" + observaciones + ", entregado=" + entregado + '}';
    }

    //Metodos 
    public abstract double calcularImporte(Comprobante comprobante);
}
