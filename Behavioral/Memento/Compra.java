/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Memento;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Compra {
    
    int numero;
    ArrayList<Item> itens = new ArrayList<>();

    public Compra(int numero) {
        this.numero = numero;
    }
    
    public void addItem(Item item){
        this.itens.add(item);
    }
    
    public Compra createMemento(){
        Compra memento = new Compra(this.numero);
        for(Item item : itens){
            memento.itens.add(item);
        }
        return memento;
    }
    
    public void restoreMemento(Compra memento){
        this.itens.clear();
        
        this.numero = memento.numero;
        for(Item item : memento.itens){
            this.itens.add(item);
        }
    }
    
}
