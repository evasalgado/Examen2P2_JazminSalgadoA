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
public class AdministrarCarro implements Serializable{
    private ArrayList<carro> listBroom = new ArrayList<>();
    private File archivo = null;

    public AdministrarCarro(String path) {
          archivo = new File(path);
    }

    public ArrayList<carro> getListBroom() {
        return listBroom;
    }

    public void setListBroom(ArrayList<carro> listBroom) {
        this.listBroom = listBroom;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listBroom=" + listBroom ;
    }
    
    public void  setCarro(carro c){
        this.listBroom.add(c);
    }
    
    public void cargar(){
        try {
            listBroom = new ArrayList<>();
            carro temp;
            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (carro) objeto.readObject()) != null) {
                    listBroom.add(temp);
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
            for (carro c: listBroom) {
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
