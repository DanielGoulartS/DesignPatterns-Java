/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class ZNoite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ZEstrela sol = new ZEstrela("Amarela", 3000);
       ZObservador observador = new ZTelescopio();
       ZObservador observador2 = new ZTelescopio();
       ZObservador observador3 = new ZTelescopio();
       
       
       sol.addObservador(observador);
       sol.addObservador(observador2);
       sol.addObservador(observador3);
       
       sol.setCor("Amarelo");
       sol.setCor("Alaranjado");
       sol.setDistancia(3001);
       
    }
    
}
