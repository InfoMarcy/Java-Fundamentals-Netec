package com.gruposalinas.dto;

public class Factura extends TicketDeCompra {

    private int folio;
    private Cliente cliente;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    public void imprimir() {
        System.out.println("Datos del cliente: ");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Domicilio: " + cliente.getDomicilio()); 
        System.out.println("Email: " + cliente.getEmail()); 
        System.out.println("RFC: " + cliente.getRfc()); 
        System.out.println("Folio: " + cliente.getNumero());
        System.out.println(); 
        
        super.imprimir();
        
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "folio=" + folio + ", cliente=" + cliente + '}';
    }

 


    

}
