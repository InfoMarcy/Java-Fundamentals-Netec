package com.gruposalinas.test;

import com.gruposalinas.dao.CarritoDeCompras;
import com.gruposalinas.dto.Cliente;
import com.gruposalinas.dao.Tienda;
import com.gruposalinas.dto.Articulo;

public class TestPuntoDeVenta {
      public static void main(String args[]) throws Exception{
          System.out.println("Creando Tienda" + "\n");
          Tienda tienda = new Tienda();
          Tienda tienda2 = new Tienda(2,"Roma 102", "561-123-3262", "Rfctienda" );
          
    
           
           System.out.println("Creando Cliente" + "\n");
           Cliente cliente1 = new Cliente(1, "RFCf324531231", "Jose@gmail.com");
           Cliente cliente2 = new Cliente(2, "RFCf324531231", "Juan@gmail.com");
          
           Articulo articulo = new Articulo(1,"Honda City 2015", 300_123.99, 45000 );
           Articulo articulo2 = new Articulo(2, "Nevera", 300_123.99, 45000);
         
           
           CarritoDeCompras carrito = new CarritoDeCompras();
           if(articulo != null ){
             carrito.agregaArticulo(articulo);
                cliente1.setCarritoCompras(carrito);
                cliente2.setCarritoCompras(carrito);
           } 
           
              if(articulo2 != null ){
               carrito.agregaArticulo(articulo2);
                cliente2.setCarritoCompras(carrito);
                cliente2.setCarritoCompras(carrito);
           } 
           
          
           
           
           tienda.altaCliente(cliente1);
            tienda.altaCliente(cliente2);
            
            tienda.imprimeClientes();
            carrito.imprimir();
            
       
         

           
          
      }
}