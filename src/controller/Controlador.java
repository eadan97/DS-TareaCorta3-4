/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;
import model.Farmacia;
import model.Producto;

/**
 *
 * @author ericka
 */
public class Controlador {
    private static Controlador singleton;
    private DTOProductos dTOProductos;
    private DTOFarmacias DTOFarmacias;
    private GestorProductos gProductos;
    private GestorFarmacias gFarmacias;
    private GestorClientes gClientes;
    
    private Controlador() {
        gProductos = new GestorProductos();
        gFarmacias = new GestorFarmacias();
        gClientes = new GestorClientes();
        dTOProductos = new DTOProductos();
        DTOFarmacias = new DTOFarmacias();
    }
    
    private synchronized static void setInstance(){
        if(singleton==null)
            singleton=new Controlador();
    }
    
    public static Controlador getInstance(){
        if(singleton==null) 
            setInstance();
        return singleton;
    }

    public DTOProductos getdTOProductos() {
        return dTOProductos;
    }
    
    
    public boolean registrarProducto(int codigo, String descripcion, int unidades, int puntos){
        return true;
        
    }

    public boolean registrarProducto(){
        System.out.println("en el Controlador solicitando registro de producto");
        
        return gProductos.crearProducto(dTOProductos.getUnProducto());
    }
    
    public void recuperarProductos(){
        dTOProductos.setLosProductos((List) gProductos.recuperar());
    }

    public boolean recuperarProducto() {
        Producto elPrd =  gProductos.consultarProducto(dTOProductos.getUnProducto().getCodigo());
        dTOProductos.setUnProducto(elPrd);
        return elPrd!=null;   
    }
    
    public boolean registarFarmacia(int codigo, String descripcion, String telefono){
        return true;
    }
    
    public boolean registrarFarmacia(DTOFarmacias dtoFarmacia){
        System.out.println("La vista envío el dtoFarmacia para ser registrado");
        System.out.println(dtoFarmacia.getUnaFarmacia().getDescripcion());
        Farmacia laFarm = dtoFarmacia.getUnaFarmacia();
        return gFarmacias.crearFarmacia(laFarm);
    }
    
    public DTOFarmacias recuperarFarmacia(DTOFarmacias dtoFarmacia){
        dtoFarmacia.setUnaFarmacia(gFarmacias.consultarFarmacia(dtoFarmacia.getUnaFarmacia().getCodigo()));
        return dtoFarmacia;
    }
    
    public DTOFarmacias recuperarFarmacias(DTOFarmacias dtoFarmacia){
        dtoFarmacia.setLasFarmacias((List)gFarmacias.recuperar() );
        return dtoFarmacia;
    }

    public DTOFarmacias getDTOFarmacias() {
        return DTOFarmacias;
    }
    
    public boolean registrarFactura(){
        System.out.println("en el Controlador solicitando registro de factura");
        
        /**
         * El sistema va y llama al gestor e ingresa la factura.
         */
        return true;
    }
    public boolean registrarCliente(DTOClientes dtoCliente){
        System.out.println("La vista envío el dtoCliente para ser registrado");
        Cliente elClien = dtoCliente.getCliente();
        return gClientes.crearCliente(elClien);
    }
    
    public DTOClientes recuperarCliente(DTOClientes dtoCliente){
        //dtoCliente.setCliente(gClientes.consultarClientes(dtoCliente.getCliente().getCedula()));
        return dtoCliente;
    }
    
    public DTOClientes  recuperarClientes(DTOClientes dtoClientes){
        dtoClientes.setClientes((List)gClientes.recuperar() );
        return dtoClientes;
    }
    
    
}
