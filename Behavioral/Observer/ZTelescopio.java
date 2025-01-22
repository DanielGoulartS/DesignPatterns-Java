/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class ZTelescopio implements ZObservador{

    @Override
    public void update(ZEstrela objeto) {
        
        System.out.println("Esta estrela está brilhando em " + objeto.getCor() + " a " + objeto.getDistancia() + " anos luz.");
        
    }
    
    
    
}
