/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Mediator;

/**
 *
 * @author Daniel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Component aprovarCompra = new ProcessoAprovarCompra();
        Component solicitarMercadoria = new ProcessoSolicitarMercadoria();
        Component notificarCliente = new ProcessoNotificarCliente();

        Mediador mediador = new MediadorCct(aprovarCompra, solicitarMercadoria, notificarCliente);
        
        aprovarCompra.setMediator(mediador);
        solicitarMercadoria.setMediator(mediador);
        notificarCliente.setMediator(mediador);
        
        aprovarCompra.perguntar();

    }

}
