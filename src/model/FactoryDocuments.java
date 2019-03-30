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
public class FactoryDocuments {
 
      public static Documento getDocumento(Documento cualDocumento){
        Documento unDocumento = null;
        switch (cualDocumento){
            case factura :{
                unDocumento = new factura();            
                break;
            }
            case Canje: {
                System.out.println("Canje todavia no disponible");
                break;
            }
        }
        return unDocumento;
    }
    
    
}
