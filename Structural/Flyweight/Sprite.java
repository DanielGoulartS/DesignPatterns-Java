/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Flyweight;

/**
 *
 * @author Daniel
 */
public class Sprite implements SpriteFlyweight{

    Imagem imagem;
    
    public Sprite(String nomeImagem){
        this.imagem = new Imagem(nomeImagem);
    }
    
    @Override
    public void desenhar(Ponto ponto) {
        this.imagem.desenharImagem();
        System.out.println("No ponto (" + ponto.getX()+", "+ ponto.getY()+")");
    }
    
}
