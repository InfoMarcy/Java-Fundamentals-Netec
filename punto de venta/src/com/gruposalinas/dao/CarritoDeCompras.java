package com.gruposalinas.dao;

import com.gruposalinas.dto.Articulo;
import com.gruposalinas.exceptions.ElementosInexistentesException;
import java.util.ArrayList;

public class CarritoDeCompras {

    private static ArrayList<Articulo> articulos = new ArrayList<>();

    public void agregaArticulo(Articulo articulo) {
        if(articulo != null){
           articulos.add(articulo); 
        }
      //  articulos[articulo.getCodigo()] = articulo;
    }

    public static ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    protected static void setArticulos(ArrayList<Articulo> articulos) {
        CarritoDeCompras.articulos = articulos;
    }

    public void eliminarArticulo(int codigo) { 
        Articulo articulo;
        try{
              articulo = buscarArticulo(codigo);
              articulos.removeIf( a -> a.equals(articulo) );
        } catch(ElementosInexistentesException e){
            System.out.println("Exception => Mensaje: " + e.getMessage()); 
        }
       
       
    }

    public Articulo buscarArticulo(int codigo) throws ElementosInexistentesException {
        for (Articulo articulo : articulos) {
           
            if (articulo != null && articulo.getCodigo() == codigo) {
                return articulo;
            }

        }
        
         throw new ElementosInexistentesException("No articulo encontrado con ese codigo");

    }

    public void listarArticulos() {
        for (Articulo articulo : articulos) {
            if (articulo != null && articulo.getCodigo() != 0) {
                System.out.println("===================ARTICULO=======================");
                System.out.println("Codigo: " + articulo.getCodigo());
                System.out.println("Descripcion: " + articulo.getDescripcion());
                System.out.println("Precio: " + (articulo.getPrecio() == 1 ? (articulo.getPrecio() + " peso") : (articulo.getPrecio() +" pesos")));
                System.out.println("Descuento: " + articulo.getDescuento());
                System.out.println("Garantia: " + articulo.getGarantia());
                double subtotal = (articulo.getPrecio() - articulo.getDescuento());
                System.out.println("Subtotal: " + subtotal);
                System.out.println();

            }

        }
    }
    
     public void imprimir() {
                 for (Articulo articulo : articulos) {
            if (articulo != null && articulo.getCodigo() != 0) {
                System.out.println("Codigo: " + articulo.getCodigo());
                System.out.println("Descripcion: " + articulo.getDescripcion());
                System.out.println("Precio: " + (articulo.getPrecio() == 1 ? (articulo.getPrecio() + " peso") : (articulo.getPrecio() +" pesos")));
                System.out.println("Descuento: " + articulo.getDescuento());
                System.out.println("Garantia: " + articulo.getGarantia());
                //double subtotal = (articulo.getPrecio() - articulo.getDescuento());
               // System.out.println("Subtotal: " + subtotal);
                System.out.println();

            }

        }
     }

 /*   public void imprimir() {
        double total = 0;
        for (Articulo item : this.articulos) {

            if (item != null && item.getPrecio() != 0) {
                total += (item.getPrecio() - item.getDescuento());
            }

        }

        System.out.println("Total: " + total);
    }*/

  

}
