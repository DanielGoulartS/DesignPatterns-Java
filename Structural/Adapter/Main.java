/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Structural.Adapter;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FemeaPontinhos tomadaPontinhos = new FemeaPontinhos();
        FemeaTracinhos tomadaTracinhos = new FemeaTracinhos();
        FemeaPontinhos adaptador = new AdapFPontinhosMTracinhos(tomadaTracinhos);
        MachoPontinhos aparelho = new MachoPontinhos(tomadaPontinhos);
        aparelho.Conectar();
        
        aparelho = new MachoPontinhos(adaptador);
        aparelho.Conectar();
        
    }
    
}
