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
public class ModeloOrden {
    String idOrden;
    int cantidad;
    String fecha;
    String tipoDePago;
    String idMesero;

    public ModeloOrden(String idOrden, int cantidad, String fecha, String tipoDePago, String idMesero) {
        this.idOrden = idOrden;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.tipoDePago = tipoDePago;
        this.idMesero = idMesero;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public String getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(String idMesero) {
        this.idMesero = idMesero;
    }
    
    
    
    
}
