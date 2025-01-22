/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ZEstrela {

    String cor;
    int distancia;
    ArrayList<ZObservador> observadores;

    public ZEstrela(String cor, int distancia) {
        this.cor = cor;
        this.distancia = distancia;
        this.observadores = new ArrayList();
        notar();
    }

    public void notar() {

        if (! (this.observadores.isEmpty())) {
            for (ZObservador observador : this.observadores) {
                observador.update(this);
            }
        }

    }

    public void addObservador(ZObservador observador) {
        this.observadores.add(observador);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
        notar();
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
        notar();
    }

}
