package com.gruposalinas.dto;

import com.gruposalinas.dao.CarritoDeCompras;

public class Cliente extends Persona implements Comparable<Cliente>{

    public static int folio = 1;

    private int numero;
    private String rfc;
    private String email;
    private CarritoDeCompras carritoCompras;

    public Cliente(String nombre, String Domicilio, int edad, String rfc, String email) {
        this.numero = folio++;
        setRfc(rfc);
        setEmail(email);
        setNombre(nombre);
        setDomicilio(Domicilio);
        setEdad(edad);
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
        this.rfc = rfc.toUpperCase();
    }

    public String getEmail() {
        return email.toUpperCase();
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

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", rfc=" + rfc + ", email=" + email + '}';
    }

 

    @Override
    public int compareTo(Cliente cliente) {
                  return cliente.getNombre().compareTo(this.getNombre());
    }

}
