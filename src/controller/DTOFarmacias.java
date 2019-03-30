<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
package controller;

import java.util.List;
import model.Farmacia;
<<<<<<< HEAD

public class DTOFarmacias {
    
    private Farmacia farmacia;
    private List ListaFarmacias = null;
    
    public DTOFarmacias(){
        farmacia = new Farmacia();
    }
    
    public Farmacia getFarmacia(){
        return farmacia;
    }
    
    public void setFarmacia(Farmacia pFarmacia){
        this.farmacia = pFarmacia;
    }
    
    public List getListaFarmacias(){
        return ListaFarmacias;
    }
    
    public void setListaFarmacias(List pListaFarmacias){
        this.ListaFarmacias =  pListaFarmacias;
    }
=======
import model.Producto;

/**
 *
 * @author ericka
 */
public class DTOFarmacias {
    
    private Farmacia unaFarmacia;
    private String usuario;
    private List lasFarmacias = null;

    public DTOFarmacias() {
        unaFarmacia= new Farmacia();
    }

    public Farmacia getUnaFarmacia() {
        return unaFarmacia;
    }

    public void setUnaFarmacia(Farmacia unaFarmacia) {
        this.unaFarmacia = unaFarmacia;
    }

    public List getLasFarmacias() {
        return lasFarmacias;
    }

    public void setLasFarmacias(List lasFarmacias) {
        this.lasFarmacias = lasFarmacias;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
>>>>>>> 6dafecf4b659f5ec2998333b9888b19c84a5076f
    
}
