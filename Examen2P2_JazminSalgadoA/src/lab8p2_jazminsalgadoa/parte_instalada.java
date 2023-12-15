/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

/**
 *
 * @author evaja
 */
public class parte_instalada {
    private String marca;
    private String clasificacion;
    private double precio;

    public parte_instalada() {
    }

    public parte_instalada(String marca, String clasificacion, double precio) {
        this.setMarca(marca);
        this.clasificacion = clasificacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
//,\n" +
//"Fifteen52, Origin Lab, RocketBunny y Urban Outlaw.

    public void setMarca(String marca) {
        try {
            if (marca.equals("Advance") || marca.equals("DTM Fiberwerkz")
                    || marca.equals("Fifteen52") || marca.equals("Origin Lab")
                    || marca.equals("RocketBunny") || marca.equals("Urban Outlaw")) {
                this.marca = marca;
            }
        } catch (Exception e) {
            System.out.println("Marca no aceptada");
        }
    }

    public String getClasificacion() {
        return clasificacion;
    }
//Spoiler, Rear Bumper, Front Bumper, Side Skirts, Front
//Fender, Rear Fender y Hood.
    public void setClasificacion(String clasificacion) {
        try {
            if (clasificacion.equals("Spoiler")||clasificacion.equals("Rear Bumper")
                    ||clasificacion.equals("Front Bumper")||clasificacion.equals("Side Skirts")
                    ||clasificacion.equals("Front Fender")||clasificacion.equals("Rear Fender")
                    ||clasificacion.equals("Hood")) {
                
            }
        } catch (Exception e) {
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", clasificacion=" + clasificacion + ", precio=" + precio + '}';
    } 
}
