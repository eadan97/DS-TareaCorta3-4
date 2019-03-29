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

    private DTOProductos dTOProductos;
    private GestorProductos gProductos;
    
    public Controlador() {
        gProductos = new GestorProductos();
        dTOProductos = new DTOProductos();
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
}
