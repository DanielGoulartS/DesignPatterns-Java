/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.ChainOfResponsability;

/**
 *
 * @author Daniel
 */
public abstract class Tarifador {
    
    Tarifador next;
    
    void Tarifador(Tarifador tarifador){
        this.next = tarifador;
    }
    
    void Executar(int ligacao){        
        if(next != null){
            next.Executar(ligacao);
        }else{
            System.out.println("FALHA NA EXECUÇÂO...");
        }
    }    
    
}
