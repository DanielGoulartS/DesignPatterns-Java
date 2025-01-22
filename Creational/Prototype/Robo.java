/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Creational.Prototype;

/**
 *
 * @author Daniel
 */
public class Robo implements ProtoFace{
    private String modelo;
    private int versao;

    public Robo(String modelo, int versao) {
        this.modelo = modelo;
        this.versao = versao;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public void Falar(){
        System.out.printf("Eu sou o Robô %s, versão: %s", this.getModelo(), this.getVersao());
    }
    
    @Override
    public Robo clone(Robo robo) {
        return this;
    }
    
    
    
}
