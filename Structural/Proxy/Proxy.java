/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Proxy;

/**
 *
 * @author Daniel
 */
public class Proxy implements Cliente{

    Cliente clienteConcreto;
    
    @Override
    public void setNome(String nome) {
        System.err.println("Not supported yet.111"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCPF(int CPF) {
        System.err.println("Not supported yet.222"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getNome() {
        return this.clienteConcreto.getNome();
    }

    @Override
    public int getCPF() {
        return this.clienteConcreto.getCPF();
    }
    
    public Proxy(ClienteConcreto cliente){
        this.clienteConcreto = cliente;
    }
}
