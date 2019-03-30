/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Factura;
//import model.factura;
import model.Farmacia;
import model.Producto;

/**
 *
 * @author ericka
 */
public class DTOFactura {
    
    private Factura unaFactura;
    private String usuario;
    private List lasFacturas = null;

    public DTOFactura() {
        unaFactura= new Factura();
    }

    public Factura getUnaFarmacia() {
        return unaFactura;
    }

    public void setUnaFarmacia(Factura unaFactura) {
        this.unaFactura = unaFactura;
    }

    public List getLasFarmacias() {
        return lasFacturas;
    }

    public void setLasFarmacias(List lasFacturas) {
        this.lasFacturas = lasFacturas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
