package com.gruposalinas.dto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TicketDeCompra {

    private static int siguienteId = 0001;

    public TicketDeCompra() {
        this.numero = siguienteId++;
    }

    private int numero;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;

    public int getNumero() {
        return numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
        this.total = total;
    }


         public void imprimir() {
             System.out.println("número de ticket: " + this.numero);
             System.out.println("Fecha: " + LocalDate.now().plusDays(7).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    
        
}
