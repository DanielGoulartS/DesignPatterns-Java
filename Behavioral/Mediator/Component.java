/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Design_Patterns.Behavioral.Mediator;

/**
 *
 * @author Daniel
 */
public abstract class Component {
    
    Mediador mediator;
    
    abstract boolean responder();
    abstract void perguntar();

    public void setMediator(Mediador mediator) {
        this.mediator = mediator;
    }
    
}
