/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author curso
 */
public class DAO_Imp_Clientes implements DAOInterface {
    
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public DAO_Imp_Clientes() {
        for (int i = 1; i <= 10; i++) {
            clientes.add(new Cliente("Nom: "+i,"Apel: "+i,"Ced: "+i,"tel: "+1,"Correo: "+1,i));
        } 
    }

    @Override
    public boolean registrar(Object obj) {
        
        Cliente elCli = (Cliente) obj;
        System.out.println(" aqui se inserta el cliente en la BD");
        Conexion.getInstance().getConexion();
        clientes.add((Cliente) obj);
        
        
        Conexion.getInstance().desconectar();
        return true;
    }

    @Override
    public List recuperar() {
        Conexion.getInstance().getConexion();
        // la magia de la recuperacion
        
        // simula que hace el select from.... 
        Conexion.getInstance().desconectar();
        return clientes;
    }

    @Override
    public Object recuperar(Object clave) {
        String codigo = (String) clave;
        Conexion.getInstance().getConexion();
        
        // la magia de la recuperacion por id
        Cliente elCli = new Cliente();
        elCli.setCedula(codigo);
        int donde = clientes.indexOf(elCli);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? clientes.get(donde) : null);
    }
}
