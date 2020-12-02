/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe
 */
public class ModeloMesero {
    
    String idMesero;
    String Nombre;
    String pAp;
    String telefono;
    int salario;

    public ModeloMesero(String idMesero, String Nombre, String pAp, String telefono, int salario) {
        this.idMesero = idMesero;
        this.Nombre = Nombre;
        this.pAp = pAp;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(String idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getpAp() {
        return pAp;
    }

    public void setpAp(String pAp) {
        this.pAp = pAp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    
}
