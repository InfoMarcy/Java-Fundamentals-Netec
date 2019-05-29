package com.gruposalinas.dao;

import com.gruposalinas.dto.Cliente;
import com.gruposalinas.dto.TicketDeCompra;

public class Tienda {
    
    private Cliente[] clientes = new Cliente[10];
    private TicketDeCompra[] ticket = new TicketDeCompra[10];
    private int numero;
    private String Domicilio;
    private String telefono;
    private String rfc;
    
        public Tienda() {
        this.numero = 1;
        this.Domicilio = "Moctezuma 91";
        this.telefono = "561-123-4252";
        this.rfc = "tiendarfc";
    }

    public Tienda(int numero, String Domicilio, String telefono, String rfc) {
        this.numero = numero;
        this.Domicilio = Domicilio;
        this.telefono = telefono;
        this.rfc = rfc;
    }

        
    public void altaCliente(Cliente cliente) throws Exception {

        if (cliente == null) {
            throw new Exception("Cliente no puede ser nulo");
        }

        clientes[cliente.getNumero()] = cliente;
    }

    public void bajaCliente(int numero) {

    }

    public void ActualizaCliente(Cliente cliente) {

    }

    public Cliente buscaCliente(int numero) {
        return null;
    }

    public void imprimeClientes() {
        for (Cliente cliente : clientes) {
            if (cliente != null) {

                StringBuilder str = new StringBuilder();
                str.append("Datos del Cliente: \n");

                int email = cliente.getEmail().indexOf("@");
                String dominio = cliente.getEmail().substring(email);

                str.append("Email: " + cliente.getEmail() + " con dominio en: " + dominio + "\n");
                str.append("RFC: " + cliente.getRfc() + "\n");
                str.append("Numero: " + cliente.getNumero() + "\n" + "\n");

                str.append("Carrito del Cliente: Lista de articulos");

                System.out.println(str);

                cliente.getCarritoCompras().listarArticulos();

            }
        }
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public TicketDeCompra[] getTicket() {
        return ticket;
    }

    public void setTicket(TicketDeCompra[] ticket) {
        this.ticket = ticket;
    }

    public int getNumero() {
        return numero;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }

}
