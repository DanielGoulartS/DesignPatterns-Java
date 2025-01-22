/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Flyweight;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class FlyweightFactory{

    protected ArrayList<SpriteFlyweight> flyweights;
    
    public enum Sprites {
        PLAYER, ENEMY1, ENEMY2, ENEMY3, SCENE;
    }
    
    public FlyweightFactory(){
        flyweights = new ArrayList<>();
        flyweights.add(new Sprite("Player"));
        flyweights.add(new Sprite("Enemy"));
        flyweights.add(new Sprite("Bad Enemy"));
        flyweights.add(new Sprite("Baddest Enemy"));
        flyweights.add(new Sprite("Scene"));
    }
    
    public SpriteFlyweight getFlyweight(Sprites jogador){
        switch(jogador){
            case PLAYER:
                return flyweights.get(0);
            case ENEMY1:
                return flyweights.get(1);
            case ENEMY2:
                return flyweights.get(2);
            case ENEMY3:
                return flyweights.get(3);
            case SCENE:
                return flyweights.get(4);
        }
        return null;
    }
}
