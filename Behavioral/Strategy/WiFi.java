/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Strategy;

/**
 *
 * @author Daniel
 */
public class WiFi {

    String Acessar(String mensagem, Criptografias tipo){
        
        return tipo.descriptografar(mensagem);
        
    }
    
}
