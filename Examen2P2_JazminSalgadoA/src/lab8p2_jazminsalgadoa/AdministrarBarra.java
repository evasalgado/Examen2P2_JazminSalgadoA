/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgadoa;

import javax.swing.JProgressBar;

/**
 *
 * @author evaja
 */
public class AdministrarBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int time;

    public AdministrarBarra(JProgressBar barra, int time) {
        this.barra = barra;
        this.time=time;
        avanzar = true;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(10*time);
            } catch (InterruptedException ex) {
            }
        }
    }

}
