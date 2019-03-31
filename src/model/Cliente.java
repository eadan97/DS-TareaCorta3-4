/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author curso
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String correo;
    private int ptsAcum;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String cedula, String telefono, String correo, int ptsAcum) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.ptsAcum = ptsAcum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getPtsAcum() {
        return ptsAcum;
    }

    public void setPtsAcum(int ptsAcum) {
        this.ptsAcum = ptsAcum;
    }
    
}
