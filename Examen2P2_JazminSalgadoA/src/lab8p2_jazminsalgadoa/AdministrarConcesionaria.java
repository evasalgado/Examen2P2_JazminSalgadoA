/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class AdministrarConcesionaria implements Serializable{

    private ArrayList<concesionaria> listC = new ArrayList();
    private File archivo = null;

    public AdministrarConcesionaria(String path) {
        archivo = new File(path);
    }

    public ArrayList<concesionaria> getListC() {
        return listC;
    }

    public void setListC(ArrayList<concesionaria> listC) {
        this.listC = listC;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listC=" + listC;
    }

    public void setConcesionaria(concesionaria c) {
        this.listC.add(c);
    }

    public void cargar() {
        try {
            listC = new ArrayList<>();
            concesionaria temp;
            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (concesionaria) objeto.readObject()) != null) {
                    listC.add(temp);
                }
            } catch (Exception e) {
            }
            objeto.close();
            entrada.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (concesionaria c : listC) {
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
