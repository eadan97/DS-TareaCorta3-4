/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aleta
 */
public class  LineaFactura {
    
   private int codigoFactura;
   private int producto;
   private  int cantidad;
   private int precio;
   private int puntos;
    
        
    public void LineaFactura(int codigoFactura,int producto,int cantidad, int precio, int puntos){
        
         this.codigoFactura= codigoFactura;
         this.producto=producto; 
         this.cantidad=cantidad;
         this.precio=precio;
         this.puntos=puntos;
        
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
