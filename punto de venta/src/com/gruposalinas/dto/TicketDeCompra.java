package com.gruposalinas.dto;

import com.gruposalinas.dao.CarritoDeCompras;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TicketDeCompra extends CarritoDeCompras {

    private static int siguienteId = 0001;

    /**
     *
     */
    public TicketDeCompra() {
        this.numero = siguienteId++;
    }

    private int numero;
    private double subtotal;
    private double descuento;
    private double iva = 0.16;
    private double total;

    public void imprimir() {
        System.out.println("===========================================================");
        System.out.println("========================== Factura=========================");
        System.out.println("===========================================================");
        System.out.println("Número de ticket: " + this.numero);
        System.out.println("Fecha: " + LocalDate.now().plusDays(7).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        super.imprimir();

        ArrayList<Articulo> articulos = getArticulos();

        for (Articulo item : articulos) {
            setSubtotal((item.getPrecio() - item.getDescuento()));

        }
        setTotal(getSubtotal() * (1 + getIva()));
        
         System.out.println("===========================================================");
        System.out.println("===========================================================");
        System.out.println("Subtotal: $" + getSubtotal());
        System.out.println("El iva es: " + getIva());
        System.out.println("Total a pagar: $" + getTotal());
    }

    public int getNumero() {
        return numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal += subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

}
