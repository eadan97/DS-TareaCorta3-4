/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aleta
 */
public class Factura extends Documento {
  
    EncabezadoFactura Encabezado;
    LineaFactura lineas;
    private int cliente;
    private int codigo;
    private String fecha;
   private int codigoFactura;
   private int producto;
   private  int cantidad;
   private int precio;
   private int puntos;

    public Factura(int i, Farmacia farmacia, Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Factura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void DefinirEncabezado(){
        Encabezado = new EncabezadoFactura(fecha,cliente,codigo);
        System.out.println("se define el encabezado");
    }
    public  void DefinirLineas(){
        lineas= new LineaFactura();
        
    }
 
    public void Factura(){       
       
        System.out.println("factura");
        
    }

    public void setCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
           
}
