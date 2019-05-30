package com.gruposalinas.dao;

import com.gruposalinas.dto.Cliente;
import com.gruposalinas.dto.TicketDeCompra;
import java.util.ArrayList;

public class Tienda {

    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<TicketDeCompra> tickets = new ArrayList<>();
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
        clientes.add(cliente);
       // clientes[cliente.getNumero()] = cliente;
    }

    public void bajaCliente(int numero) {
        Cliente cliente = buscaCliente(numero);
        if (cliente != null) {
            clientes.remove(cliente);
           // clientes[numero] = null;
        }
    }

    public void ActualizaCliente(Cliente cliente) throws Exception {

        if (cliente == null) {
            throw new Exception("El Objeto cliente es requerido para la operación");
        }

        Cliente verificarCliente = buscaCliente(cliente.getNumero());
        if (verificarCliente != null) {

            clientes.remove(cliente);
            clientes.add(cliente);
            //clientes[cliente.getNumero()] = cliente;
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

                str.append("Nombre: " + cliente.getNombre() + "\n");
                str.append("Domicilio: " + cliente.getDomicilio() + "\n");
                str.append("Edad: " + cliente.getEdad() + "\n");
                str.append("Email: " + cliente.getEmail() + " con dominio en: " + dominio + "\n");
                str.append("RFC: " + cliente.getRfc() + "\n");
                str.append("Numero: " + cliente.getNumero() + "\n" + "\n");

                str.append("Carrito del Cliente: Lista de articulos");

                System.out.println(str);

                cliente.getCarritoCompras().listarArticulos();

            }
        }
    }
/*
    public void imprimeCarritoCompras() {
        int noClientes = Cliente.folio;
        int noArticulos = Articulo.folio;

        Articulo carrito[][] = new Articulo[noClientes][noArticulos];

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] != null) {
                System.out.println("Cliente: " + clientes[i].getNumero());

                if (this.buscaCliente(clientes[i].getNumero()) != null) {
                    //clientes[i].getCarritoCompras().listarArticulos();
                    System.out.println("El cliente  numero: " + clientes[i].getNumero() + " tiene el siguiente carrito: ");
                    for (int j = 0; j < clientes[i].getCarritoCompras().getArticulos().length; j++) {

                        if (clientes[i].getCarritoCompras().getArticulos()[j] != null) {
                            carrito[i][j] = clientes[i].getCarritoCompras().getArticulos()[j];
                            System.out.println(carrito[i][j].getDescripcion());
                        }
                    }

                }

            }
            
      

        }

    }*/
/*
public void imprimeCarritoCompras() {
        ArrayList<Articulo> misArticulos = new ArrayList<>();
        

        for (int i = 0; i < clientes.length;i++) {

            if (clientes[i] != null) {
                System.out.println("Cliente: " + clientes[i].getNumero());

                if (this.buscaCliente(clientes[i].getNumero()) != null) {
                    //clientes[i].getCarritoCompras().listarArticulos();
                    System.out.println("El cliente  numero: " + clientes[i].getNumero() + " tiene el siguiente carrito: ");
                    for (int j = 0; j < clientes[i].getCarritoCompras().getArticulos().length; j++) {

                        if (clientes[i].getCarritoCompras().getArticulos()[j] != null) {
                            misArticulos.add(clientes[i].getCarritoCompras().getArticulos()[j]);
                        }
                    }

                }

            }
            
      

        }
    }
*/
    public void agregarTicker(TicketDeCompra ticket) {

        if (ticket != null) {
            tickets.add(ticket);
            //tickets[ticket.getNumero()] = ticket;
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

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Tienda.clientes = clientes;
    }

    public static ArrayList<TicketDeCompra> getTickets() {
        return tickets;
    }

    public static void setTickets(ArrayList<TicketDeCompra> tickets) {
        Tienda.tickets = tickets;
    }

    
    
}
