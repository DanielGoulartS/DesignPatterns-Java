/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Strategy;

/**
 *
 * @author Daniel
 */
public class WPA2PSK implements Criptografias{
    
        @Override
    public String descriptografar(String mensagem) {
        String result = "Algoritmo Compatível. Acessado.";
        
        if(mensagem.equals("UserSenha123")){
        return result;
        }
        
        return "Incapaz de realizar operação com este módulo, tente outro ou crie mais um.";
    }
    
}
