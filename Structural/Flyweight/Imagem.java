/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Flyweight;

/**
 *
 * @author Daniel
 */
public class Imagem {
    
    public String nomeImagem;
    
    public Imagem(String nome){
        this.nomeImagem = nome;
    }
    
    public void desenharImagem(){
        System.out.println("Imagem "+ this.nomeImagem +" desenhada");
    }
    
}
