/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguara.aguaraenvios.Models;

import java.util.Date;

/**
 *
 * @author Nelkha
 */
public class formContrareembolso extends Comprobante {

    private String retiraEn;
    private double efectivo;
    private double cheque;
    private String nroCheuqe;
    private double costoServ;
    private double aPagar;

    public formContrareembolso(String retiraEn, double efectivo, double cheque, String nroCheuqe, double costoServ, long idComprobante, Date fecha, String remitente, String destinatario, String cuitDestinatario, Localidad localidadDestinatario, String domicilioDestinatario, String telefonoDestinatario, double importeAPagar, String observaciones) {
        super(idComprobante, fecha, remitente, destinatario, cuitDestinatario, localidadDestinatario, domicilioDestinatario, telefonoDestinatario, importeAPagar, observaciones);
        this.retiraEn = retiraEn;
        this.efectivo = efectivo;
        this.cheque = cheque;
        this.nroCheuqe = nroCheuqe;
        this.costoServ = costoServ;
        
    }

    public String getRetiraEn() {
        return retiraEn;
    }

    public void setRetiraEn(String retiraEn) {
        this.retiraEn = retiraEn;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getCheque() {
        return cheque;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public String getNroCheuqe() {
        return nroCheuqe;
    }

    public void setNroCheuqe(String nroCheuqe) {
        this.nroCheuqe = nroCheuqe;
    }

    public double getCostoServ() {
        return costoServ;
    }

    public void setCostoServ(double costoServ) {
        this.costoServ = costoServ;
    }

    public double getaPagar() {
        return aPagar;
    }

    public void setaPagar(double aPagar) {
        this.aPagar = aPagar;
    }
    
    
    @Override

    public double calcularImporte(Comprobante comprobante) {
        formContrareembolso comp=(formContrareembolso) comprobante;
        this.aPagar=(comp.getEfectivo()+comp.getCheque())/100;
        return comp.getaPagar();
    }

}
