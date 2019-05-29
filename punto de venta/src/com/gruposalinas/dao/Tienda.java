package com.gruposalinas.dao;

import com.gruposalinas.dto.Cliente;
import com.gruposalinas.dto.TicketDeCompra;

public class Tienda {

    private static Cliente[] clientes = new Cliente[10];
    private static TicketDeCompra[] tickets = new TicketDeCompra[10];
    private int numero;
    private String Domicilio;
    private String telefono;
    private String rfc;

    public TicketDeCompra[] getTickets() {
        return tickets;
    }

    public void setTickets(TicketDeCompra[] tickets) {
        Tienda.tickets = tickets;
    }

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
        Cliente cliente = buscaCliente(numero);
        if (cliente != null) {
            clientes[numero] = null;
        }
    }

    public void ActualizaCliente(Cliente cliente) throws Exception {
        System.out.println("ActualizaCliente => " + cliente.getNumero());

        if (cliente == null) {
            throw new Exception("El Objeto cliente es requerido para la operación");
        }

        Cliente verificarCliente = buscaCliente(cliente.getNumero());
        if (verificarCliente != null) {

            clientes[cliente.getNumero()] = cliente;
            System.out.println("EL cliente ha sido actualizado.");
        }
    }

    public Cliente buscaCliente(int numero) {
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                if (cliente.getNumero() == numero) {
                    return cliente;
                }
            }
        }
        return null;
    }

    public Cliente buscaCliente(String rfc) {
        for (Cliente cliente : clientes) {

            if (cliente != null && cliente.getRfc().equals(rfc)) {
                return cliente;

            }
        }
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

    public void agregarTicker(TicketDeCompra ticket) {

        if (ticket != null) {
            tickets[ticket.getNumero()] = ticket;
        }

    }

    public TicketDeCompra buscarTicket(int numero) {
        for (TicketDeCompra ticket : tickets) {

            if (ticket != null && ticket.getNumero() == numero) {
                return ticket;
            }
        }

        return null;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    private void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
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
