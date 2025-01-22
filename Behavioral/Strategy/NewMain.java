/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.Strategy;

/**
 *
 * @author Daniel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WiFi rede = new WiFi();
        
        Criptografias wep = new WEP();
        Criptografias wpa = new WPA();
        Criptografias wpa2psk = new WPA2PSK();
        
        System.err.println(rede.Acessar("UserSenha", wep));
        System.out.println(rede.Acessar("UserSenha", wpa));
        System.err.println(rede.Acessar("UserSenha", wpa2psk));
    }
    
}
