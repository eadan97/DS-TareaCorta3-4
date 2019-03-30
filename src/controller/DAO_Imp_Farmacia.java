/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Farmacia;

/**
 *
 * @author ericka
 */
public class DAO_Imp_Farmacia implements DAOInterface{
    
    private ArrayList<Farmacia> lFarm = new ArrayList<Farmacia>();
    
    public DAO_Imp_Farmacia() {
        for (int i = 1; i <= 10; i++) {
            lFarm.add(new Farmacia(i,"Farma-"+i,"Tel:"+i));
        } 
    }

    @Override
    public boolean registrar(Object obj) {
        Farmacia laFarmacia = (Farmacia) obj;
        
        System.out.println(" aqui se inserta la farmacia en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
        lFarm.add(laFarmacia);
        
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
        return lFarm;
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
        Farmacia laFarm = new Farmacia();
        laFarm.setCodigo(codigo);
        int donde = lFarm.indexOf(laFarm);
        System.out.println("DOnde: "+donde);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lFarm.get(donde) : null);
    }
    
}
