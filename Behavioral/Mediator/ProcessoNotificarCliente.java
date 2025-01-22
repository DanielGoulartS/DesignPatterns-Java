/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Mediator;

/**
 *
 * @author Daniel
 */
public class ProcessoNotificarCliente extends Component{


    @Override
    boolean responder() {
        return true;
    }

    @Override
    void perguntar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
