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
class EncabezadoFactura {
    private String fecha;
    private int cliente;
    private int CodigoFactura;

    public EncabezadoFactura(String fecha, int cliente, int CodigoFactura) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.CodigoFactura = CodigoFactura;
    }

    EncabezadoFactura(Date fecha, int cliente, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(int CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }
    
    
}


