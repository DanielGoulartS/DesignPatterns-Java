/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class Porcentagem implements Observer {

    @Override
    public void update(ProdEstoque loja) {

        double aValor = ((loja.a+loja.b+loja.c)*(loja.a*0.01));
        double bValor = ((loja.a+loja.b+loja.c)*(loja.b*0.01));
        double cValor = ((loja.a+loja.b+loja.c)*(loja.c*0.01));
        
        
        
        System.out.println("\nTotalidade de Produtos:"
                + "\nProduto A: " + aValor + "%"
                + "\nProduto B: " + bValor + "%"
                + "\nProduto C: " + cValor + "%");

    }
}
