package com.gruposalinas.test;

import com.gruposalinas.dao.CarritoDeCompras;
import com.gruposalinas.dto.Cliente;
import com.gruposalinas.dao.Tienda;
import com.gruposalinas.dto.Articulo;
import com.gruposalinas.dto.TicketDeCompra;

public class TestPuntoDeVenta {

    public static void main(String args[]) throws Exception {
        
        System.out.println("length => " + args.length);
        System.out.println("args 0=> " + args[0]);
        System.out.println("args 1=> " + args[1]);
        
        //Login
        
        
        
        if(args.length == 0 || (!args[0].equals("Mercy") && !args[1].equals("123"))){
            System.exit(0);
        }
          
        System.out.println("Creando Tienda" + "\n");
        Tienda tienda = new Tienda();
        Tienda tienda2 = new Tienda(2, "Roma 102", "561-123-3262", "Rfctienda");

        System.out.println("Creando Cliente" + "\n");
        Cliente cliente1 = new Cliente("RFCf324531231", "Jose@gmail.com");
        Cliente cliente2 = new Cliente("RFCf324531231", "Juan@gmail.com");

        // Creando Articulos
        Articulo articulo = new Articulo(1, "Honda City 2015", 300_123.99, 45000);
        Articulo articulo2 = new Articulo(2, "Nevera", 300_123.99, 45000);
        Articulo articulo3 = new Articulo(3, "Paleta", 1, 0);

        // Agregar articulos al carrito de los clientes
        CarritoDeCompras carrito = new CarritoDeCompras();
        if (articulo != null) {
            carrito.agregaArticulo(articulo);
            carrito.agregaArticulo(articulo3);
            cliente1.setCarritoCompras(carrito);
            cliente2.setCarritoCompras(carrito);
        }

        if (articulo2 != null) {
            carrito.agregaArticulo(articulo2);
            cliente2.setCarritoCompras(carrito);
            cliente2.setCarritoCompras(carrito);
        }

        // Dar de alta al cliente
        tienda.altaCliente(cliente1);
        tienda.altaCliente(cliente2);

        
        // Busca Cliente
        Cliente updateCliente = tienda.buscaCliente(1);
        updateCliente.setEmail("hola@bancoazteca.com");
        updateCliente.setRfc("RCF12345");
        // Actualiza Cliente
        tienda.ActualizaCliente(updateCliente);

        // Da de baja a un cliente (Este primero hace la busqueda del cliente y si existe lo elimina)
        //tienda.bajaCliente(1);
        // Elimina articulo del carrito (Este primero hace la busqueda del articulo y si existe lo elimina)
        carrito.eliminarArticulo(2);

        // Imprime cliente
        tienda.imprimeClientes();

        // Imprime los articulos que existen en el carrito
        carrito.imprimir();
  
        // System.out.println("Busqueda Cliente por RFC => " + tienda.buscaCliente("RFCf324531231").toString());  
        //  System.out.println("Busqueda Cliente por numero => " + tienda.buscaCliente(2).toString());
        if (tienda.getTickets() == tienda2.getTickets()) {
            System.out.println("Tickets de la tienda 1 es igual al ticket de la tienda 2");
        } else {
            System.out.println("Los tickets son diferentes.");
        }
       
        
      // Imprime ticket  
      TicketDeCompra ticket = new TicketDeCompra();
      ticket.imprimir();

    }
}
