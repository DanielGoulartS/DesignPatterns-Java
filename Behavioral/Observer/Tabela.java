/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class Tabela implements Observer{

    @Override
    public void update(ProdEstoque loja) {
        
        System.out.println("\nEstoque:"
        + "\nProduto A: " + loja.a +" Un " 
        + "\nProduto B: " + loja.b +" Un "
        + "\nProduto C: " + loja.c +" Un ");
        
        }
    
}
