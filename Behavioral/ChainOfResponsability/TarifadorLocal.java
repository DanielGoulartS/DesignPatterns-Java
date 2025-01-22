/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.ChainOfResponsability;

/**
 *
 * @author Daniel
 */
public class TarifadorLocal extends Tarifador {

    Tarifador next;

    public TarifadorLocal(Tarifador tarifador) {
        this.next = tarifador;
    }

    void Executar(int ligacao) {

        if(ligacao <= 1) {
            System.out.println("Sua ligação Local custará: " + (ligacao + 1));
        } else {

            if (next != null) {
                next.Executar(ligacao);
            } else {
                super.Executar(ligacao);
            }
        }
    }

}
