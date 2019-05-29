package com.gruposalinas.dto;

import com.gruposalinas.dao.CarritoDeCompras;

public class Cliente {
    private int numero;
    private String rfc;
    private String email;
    private CarritoDeCompras carritoCompras;

    public Cliente(int numero, String rfc, String email) {
        this.numero = numero;
        this.rfc = rfc;
        this.email = email;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CarritoDeCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoDeCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    
}
