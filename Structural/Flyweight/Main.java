/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Structural.Flyweight;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        
        factory.getFlyweight(FlyweightFactory.Sprites.SCENE).desenhar(new Ponto(0,0));
        factory.getFlyweight(FlyweightFactory.Sprites.PLAYER).desenhar(new Ponto(10, 20));
        factory.getFlyweight(FlyweightFactory.Sprites.ENEMY1).desenhar(new Ponto(30,20));
        factory.getFlyweight(FlyweightFactory.Sprites.ENEMY2).desenhar(new Ponto(60, 20));
        factory.getFlyweight(FlyweightFactory.Sprites.ENEMY3).desenhar(new Ponto(100,20));
    }
    
}
