/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.ChainOfResponsability;

/**
 *
 * @author Daniel
 */
public class TarifadorInternacional extends Tarifador{

    Tarifador next;

    public TarifadorInternacional(Tarifador tarifador) {
        this.next = tarifador;
    }

    void Executar(int ligacao) {

        if (ligacao >= 5) {
            System.out.println("Sua ligação Internacional custará:" + (ligacao * 5));
        } else {
            
            if (next != null) {
                next.Executar(ligacao);
            } else {
                super.Executar(ligacao);
            }
        }
    }

}
