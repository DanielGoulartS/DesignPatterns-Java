/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Creational.Prototype;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robo android1 = new Robo("Android", 01);
        android1.Falar();
        
        Robo android2 = android1.clone(android1);
        android2.Falar();
    }
    
}
