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
public class AdministrarCircuito implements Serializable{
    private ArrayList<circuito> listRainbow = new ArrayList<>(); //referencia a mariokart
    private File archivo = null;

    public AdministrarCircuito(String path) {
          archivo = new File(path);
    }

    public ArrayList<circuito> getListRainbow() {
        return listRainbow;
    }

    public void setListRainbow(ArrayList<circuito> listRainbow) {
        this.listRainbow = listRainbow;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarCircuito{" + "listRainbow=" + listRainbow + '}';
    }
    
    public void setCircuito(circuito c){
        this.listRainbow.add(c);
    }
    
    public void cargar(){
        try {
            listRainbow= new ArrayList<>();
            circuito temp;
            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (circuito) objeto.readObject()) != null) {
                    listRainbow.add(temp);
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
            for (circuito c: listRainbow) {
                bw.writeObject(c);
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
