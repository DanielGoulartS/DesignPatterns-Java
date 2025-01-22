/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Mediator;

/**
 *
 * @author Daniel
 */
public class ProcessoAprovarCompra extends Component {


    @Override
    boolean responder() {
        System.out.println("Processo Aprovado");
        return true;
    }

    @Override
    void perguntar() {
        super.mediator.Notificar();
    }

}
