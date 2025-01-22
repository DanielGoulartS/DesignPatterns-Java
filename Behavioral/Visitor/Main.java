/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Visitor;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        No est1 = new Estrada(null, null, "BR101", 1000);
        No est2 = new Estrada(null, null, "Avenida", 3000);
        No est3 = new Estrada(null, null, "Estrada dos Tijolos", 2020);
        
        No loc1 = new Local(null, null, "Parque Lagos", "Ar livre", 500);
        No loc2 = new Local(null, null, "Cinema da Cidade", "Entretenimeno", 140);
        No loc3 = new Local(null, null, "Universidade Cristal", "Estudantil", 800);
        No loc4 = new Local(null, null, "Praia Fria", "Ar livre", 5000);
        
        est1.setE(loc1);
        est1.setD(loc2);
        
        loc1.setE(est2);
        loc1.setD(loc3);
        
        loc3.setE(loc4);
        loc3.setD(est3);
        
        Visitor visitante = new Visitor();
        visitante.Visitar(est1);
        
    }
    
}
