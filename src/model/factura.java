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
public class factura extends Documento {
  
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
    
    
    public void DefinirEncabezado(){
        Encabezado = new EncabezadoFactura(fecha,cliente,codigo);
        System.out.println("se define el encabezado");
    }
    public  void DefinirLineas(){
        lineas= new LineaFactura();
        
    }
 
    public void factura(){       
       
        System.out.println("factura");
        
    }


    
           
}
