/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Adapter;

/**
 *
 * @author Daniel
 */
public class MachoPontinhos {
    
    public FemeaPontinhos femea;

    public MachoPontinhos(FemeaPontinhos femea) {
        this.femea = femea;
    }
    
    
    public void Conectar(){
        femea.ConectarP();
    }
    
}
