
package com.gruposalinas.interfaces;

import com.gruposalinas.dto.Articulo;
import com.gruposalinas.exceptions.ElementosInexistentesException;

public interface OperaArticulos {
     public void agregaArticulo(Articulo articulo);
     public Articulo buscarArticulo(int codigo) throws ElementosInexistentesException;
     public void listarArticulos();
      public void eliminarArticulo(int codigo) ;
     
}
