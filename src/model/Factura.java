/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import model.Producto;
/**
 *
 * @author eadan
 */
public class Factura {
    private int codigo;
    private Farmacia farmacia;
    private Date fecha;
    private HashMap<Producto, Integer> productos;

    public Factura() {
    }

    public Factura(int codigo, Farmacia farmacia, Date fecha) {
        this.codigo = codigo;
        this.farmacia = farmacia;
        this.fecha = fecha;
        this.productos=new HashMap<Producto,Integer>();
    }
    
    public Factura(int codigo, Farmacia farmacia) {
        this.codigo = codigo;
        this.farmacia = farmacia;
        this.fecha =  Calendar.getInstance().getTime();
        this.productos=new HashMap<Producto,Integer>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public HashMap<Producto,Integer> getListaProductos() {
        return productos;
    }

    public void addProducto(Producto producto, int cantidad) {
        if(productos.containsKey(producto))
            productos.put(producto, productos.get(producto)+cantidad);
        else
            productos.put(producto, cantidad);
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", farmacia=" + farmacia.getCodigo() + ", fecha=" + fecha.toString() + ", productos=" + productos.size() + '\n';
    }

       @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
}
