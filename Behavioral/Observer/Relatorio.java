/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class Relatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdEstoque loja1 = new ProdEstoque(50, 20, 30);
        Observer tabela = new Tabela();
        Observer grafico = new Grafico();
        Observer porcentagem = new Porcentagem();
        
        loja1.addObserver(tabela);
        loja1.addObserver(grafico);
        loja1.addObserver(porcentagem);
        
        loja1.setA(50);
        loja1.setB(12);
        loja1.setC(3);
    }
    
}
