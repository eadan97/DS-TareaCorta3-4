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

    private ArrayList<Farmacia> lFarm = new ArrayList<Farmacia>();

    
    public DAO_Imp_Farmacia() {
        for (int i = 1; i <= 10; i++) {
            lFarm.add(new Farmacia(i, "Farm-"+i, ""));
        } 
    }

    
    @Override
    public boolean registrar(Object obj) {
        Farmacia elPrd = (Farmacia) obj;
        
        System.out.println(" aqui se inserta la farmacia en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
<<<<<<< HEAD
        lFarm.add(laFarmacia);
=======
        lFarm.add(elPrd);
        
        //cierra la conexion
        Conexion.getInstance().desconectar();
        
        return true;
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
        
        //cierra la conexion
        Conexion.getInstance().desconectar();
        
        return true;
    }

    @Override
    public List recuperar() {
<<<<<<< HEAD
=======
        
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
        Conexion.getInstance().getConexion();
        // la magia de la recuperacion
        
        // simula que hace el select from.... 
<<<<<<< HEAD
        Conexion.getInstance().desconectar();
        return lFarm;
=======
        
        Conexion.getInstance().desconectar();
        return lFarm;
                
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
<<<<<<< HEAD
        Farmacia laFarm = new Farmacia();
        laFarm.setCodigo(codigo);
        int donde = lFarm.indexOf(laFarm);
        System.out.println("DOnde: "+donde);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lFarm.get(donde) : null);
=======
        Farmacia elPrd = new Farmacia();
        elPrd.setCodigo(codigo);
        int donde = lFarm.indexOf(elPrd);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lFarm.get(donde) : null);
        
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
    }
    
}
