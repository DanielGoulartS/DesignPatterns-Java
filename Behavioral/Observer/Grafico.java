/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class Grafico implements Observer{

    @Override
    public void update(ProdEstoque loja) {
        String aValue = "", bValue = "", cValue = "";
        
        for(int i = 0; i < loja.a; i++) {
            aValue +="=";
        }
        for(int i = 0; i < loja.b; i++) {
            bValue +="=";
        }
        for(int i = 0; i < loja.c; i++) {
            cValue +="=";
        }
        
        System.out.println("\nGráfico:"
        + "\nProduto A: " + aValue 
        + "\nProduto B: " + bValue
        + "\nProduto C: " + cValue);
        
        }
}
