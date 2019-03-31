package controller;

import java.util.List;
import model.Cliente;


public class GestorClientes {
    
    private  DAO_Imp_Clientes elDAO;
    
    public GestorClientes() {
        this.elDAO = new DAO_Imp_Clientes();
    }
    
    public boolean crearCliente(Cliente pCliente){
        System.out.println("en el Gestor de clientes solicitando registro de clientes");
        return elDAO.registrar(pCliente);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Cliente consultarClientes(int cedula) {
        return (Cliente) elDAO.recuperar(cedula);
    }   
}
