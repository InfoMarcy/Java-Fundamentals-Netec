package com.gruposalinas.dao;

import com.gruposalinas.dto.Articulo;

public class CarritoDeCompras {

    private Articulo[] articulos = new Articulo[10];

    public void agregaArticulo(Articulo articulo) {

        
        articulos[articulo.getCodigo()] = articulo;
    }

    public void eliminarArticulo(int codigo) {   
      Articulo articulo =  buscarArticulo(codigo);
      if(articulo != null){
           articulos[codigo] = null;
      } 
}

    public Articulo buscarArticulo(int codigo) {
        for(Articulo articulo: articulos){
            if(articulo != null){
                         if(articulo.getCodigo() == codigo){
                        return articulo;
            }   
            }

        }
        return null;
    }

    public void listarArticulos() {
      for (Articulo articulo : articulos) {
            
                    if (articulo != null && articulo.getCodigo() != 0 ) {
                       System.out.println("===================ARTICULO=======================");
                        System.out.println("Codigo: " + articulo.getCodigo());
                        System.out.println("Descripcion: " + articulo.getDescripcion());
                        System.out.println("Precio: " + articulo.getPrecio());
                        System.out.println("Descuento: " + articulo.getDescuento());
                        
                         double subtotal = (articulo.getPrecio() - articulo.getDescuento());
                         System.out.println("Subtotal: " + subtotal);
                        System.out.println();
                        
                    }

                }
    }
    
    public void imprimir(){
        double total = 0;
       for(Articulo item: this.articulos){
           
           if(item != null){
                if(item.getPrecio() != 0){
               total += (item.getPrecio() - item.getDescuento());
           }
           }
          
       }
       
        System.out.println("Total: " + total);
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }

}
