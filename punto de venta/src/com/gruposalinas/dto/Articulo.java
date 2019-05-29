package com.gruposalinas.dto;

public class Articulo {

    private int codigo;
    private String descripcion;
    private double descuento;
    private double precio;

    public Articulo(int codigo, String descripcion, double descuento, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.precio = precio;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

  
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

    
}
