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

    @Override
    public boolean registrar(Object obj) {
        Conexion.getInstance().getConexion();
        clientes.add((Cliente) obj);
        
        System.out.println("DAO_Imp_Clientes.registrar("+obj+")");
        Conexion.getInstance().desconectar();
        return true;
    }

    @Override
    public List recuperar() {
        Conexion.getInstance().getConexion();
        
        System.out.println("DAO_Imp_Clientes.recuperar()");
        Conexion.getInstance().desconectar();
        return clientes;
    }

    @Override
    public Object recuperar(Object clave) {
        Conexion.getInstance().getConexion();
        
        System.out.println("DAO_Imp_Clientes.recuperar("+clave+")");
        Conexion.getInstance().desconectar();
        for (Cliente cliente : clientes) {
            if (cliente.getCedula()==clave) {
                return cliente;
            }
            
        }
        return null;
    }
}
