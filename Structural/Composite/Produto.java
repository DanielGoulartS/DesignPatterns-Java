/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Composite;

/**
 *
 * @author Daniel
 */
public class Produto implements Pedido {
    public int codigo;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    public String nome;
    
    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
}
