/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class concesionaria implements Serializable{
    private String nombre;
    private String locacion;
    private ArrayList<carro> carrosventa = new ArrayList<>();

    public concesionaria() {
    }

    public concesionaria(String nombre, String locacion) {
        this.nombre = nombre;
        this.locacion = locacion;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public ArrayList<carro> getCarrosventa() {
        return carrosventa;
    }

    public void setCarrosventa(ArrayList<carro> carrosventa) {
        this.carrosventa = carrosventa;
    }

    @Override
    public String toString() {
        return   nombre ;
    }
}
