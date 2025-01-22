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
public abstract class Dados {

    ArrayList<Observer> observadores;

    public Dados() {
        this.observadores = new ArrayList();
    }

    public void addObserver(Observer observer) {
        this.observadores.add(observer);
    }

    public void notificar() {

        for (Observer observador : this.observadores) {
            observador.update((ProdEstoque) this);
        }

    }

}
