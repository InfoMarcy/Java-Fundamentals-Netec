package com.gruposalinas.test;

public class Test {
    
    public static void main(String args[]){
    
        String[] clientes = new String[10];
        clientes[0] = "Juan";
        clientes[1] = "Pedro";
        clientes[2] = "Jose";
        
        
        for(String nombre : clientes){
            
            if(nombre != null){
                 System.out.println(nombre);
            }
            
        }
       
        


    } 
    
}
