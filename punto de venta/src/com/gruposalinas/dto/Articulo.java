package com.gruposalinas.dto;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Articulo {

public static int folio = 1;
    
    private int codigo;
    private String descripcion;
    private double descuento;
    private double precio;
    private String garantia;

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia() {
      this.garantia =  LocalDateTime.now().plusDays(7).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                
    }

    public Articulo(int codigo, String descripcion, double precio, double descuento) {
        setCodigo(codigo);
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.precio = precio;
        setGarantia();
    }

    public int getCodigo() {
        return codigo;
        
    }

    private void setCodigo(int codigo) {
        folio++;
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

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", descuento=" + descuento + ", precio=" + precio + ", garantia=" + garantia + '}';
    }

    
    
}
