/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class AdministrarJugador implements Serializable{
    private ArrayList<jugador> listJ = new ArrayList<>();
    private File archivo = null;

    public AdministrarJugador(String path) {
          archivo = new File(path);
    }

    public ArrayList<jugador> getListJ() {
        return listJ;
    }

    public void setListJ(ArrayList<jugador> listJ) {
        this.listJ = listJ;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return  "listJ=" + listJ ;
    }
    
    public void setJugador(jugador j){
        this.listJ.add(j);
    }
    
     public void cargar(){
        try {
            listJ= new ArrayList<>();
            jugador temp;
            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (jugador) objeto.readObject()) != null) {
                    listJ.add(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            entrada.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void escribir(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (jugador j: listJ) {
                bw.writeObject(j);
            }
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
