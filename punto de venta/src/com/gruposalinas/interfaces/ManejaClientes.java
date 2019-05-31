
package com.gruposalinas.interfaces;

import com.gruposalinas.dto.Cliente;

/**
 *
 * @author Netec
 */
public interface ManejaClientes {
    
    public void altaCliente(Cliente cliente);
     public void bajaCliente(int numero);
     public void ActualizaCliente(Cliente cliente);
     public Cliente buscaCliente(int numero);
     public Cliente buscaCliente(String rfc);
      public void imprimeClientes();
}
