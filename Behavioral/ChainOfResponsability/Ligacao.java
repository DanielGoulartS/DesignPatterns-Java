/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.ChainOfResponsability;

/**
 *
 * @author Daniel
 */
public class Ligacao {

    public static void main(String[] args) {
        
        Tarifador internacional = new TarifadorInternacional(null);
        Tarifador nacional = new TarifadorNacional(internacional);
        Tarifador local = new TarifadorLocal(nacional);
        
        local.Executar(0);
        local.Executar(1);
        local.Executar(2);
        local.Executar(3);
        local.Executar(4);
        local.Executar(5);
        local.Executar(6);
        
    }
}
