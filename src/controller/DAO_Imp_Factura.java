/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Factura;
import model.Farmacia;

/**
 *
 * @author ericka
 */
public class DAO_Imp_Factura implements DAOInterface{

    private ArrayList<Factura> lFact = new ArrayList<Factura>();

    
    public DAO_Imp_Factura() {
        for (int i = 1; i <= 10; i++) {
            lFact.add(new Factura(i, new Farmacia(), Calendar.getInstance().getTime()));
        } 
    }

    
    @Override
    public boolean registrar(Object obj) {
        Factura elPrd = (Factura) obj;
        
        System.out.println(" aqui se inserta la farmacia en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
        lFact.add(elPrd);
        
        //cierra la conexion
        Conexion.getInstance().desconectar();
        
        return true;
        
        
    }

    @Override
    public List recuperar() {
        
        Conexion.getInstance().getConexion();
        // la magia de la recuperacion
        
        // simula que hace el select from.... 
        
        Conexion.getInstance().desconectar();
        return lFact;
                
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
        Factura elPrd = new Factura();
        elPrd.setCodigo(codigo);
        int donde = lFact.indexOf(elPrd);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lFact.get(donde) : null);
        
    }
    
}
