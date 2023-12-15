/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

/**
 *
 * @author evaja
 */
public class circuito {

    private int longitud;
    private int cantidadcurvas;
    private String tipocarrera;
    private String locacion;

    public circuito() {
    }

    public circuito(int longitud, int cantidadcurvas, String tipocarrera, String locacion) {
        this.longitud = longitud;
        this.cantidadcurvas = cantidadcurvas;
        this.tipocarrera = tipocarrera;
        this.locacion = locacion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCantidadcurvas() {
        return cantidadcurvas;
    }

    public void setCantidadcurvas(int cantidadcurvas) {
        this.cantidadcurvas = cantidadcurvas;
    }

    public String getTipocarrera() {
        return tipocarrera;
    }

    public void setTipocarrera(String tipocarrera) {
        this.tipocarrera = tipocarrera;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    @Override
    public String toString() {
        return tipocarrera + locacion;
    }
    
}
