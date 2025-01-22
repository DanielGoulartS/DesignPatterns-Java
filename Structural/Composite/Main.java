/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Structural.Composite;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto parafusos = new Produto(10, "Parafuso");
        Produto porcas = new Produto(20, "Porcas");
        Caixa kit = new Caixa(1, "Kit");
        Produto chaveDeFenda = new Produto(30, "Chave de Fenda");
        Caixa pedido = new Caixa(2, "Pedido");
        
        
        
        kit.inserir(parafusos);
        kit.inserir(porcas);
        
        pedido.inserir(kit);
        pedido.inserir(chaveDeFenda);
        
        pedido.getItens();
    }
    
}
