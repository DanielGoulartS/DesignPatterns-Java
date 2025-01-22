/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.State;

/**
 *
 * @author Daniel
 */
public class Player {
    
    Equipamento equipamento;
    
    public void equipar(Equipamento equipamento){
        
        this.equipamento = equipamento;
        System.out.println(equipamento.getNome() + " equipado!");
        
    }
    
    public void Lutar(){
        System.out.println(this.equipamento.Responder());
    }
    
}
