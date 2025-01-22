/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Proxy;

/**
 *
 * @author Daniel
 */
public class ClienteConcreto implements Cliente{
    
    String nome;
    int CPF;
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCPF() {
        return this.CPF;
    }
    
    public ClienteConcreto(String nome, int CPF){
        this.setNome(nome);
        this.setCPF(CPF);
    }
    
}