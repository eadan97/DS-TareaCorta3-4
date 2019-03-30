/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
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
    
    private Controlador() {
        gProductos = new GestorProductos();
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
    
}
