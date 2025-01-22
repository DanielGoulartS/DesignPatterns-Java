/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Structural.Proxy;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClienteConcreto cliente1 = new ClienteConcreto("Joao", 123);
        System.out.println(cliente1.getNome() + " " + cliente1.getCPF());
        
        cliente1.setNome("Joao Vitor");
        System.out.println(cliente1.getNome() + " " + cliente1.getCPF());
        
        Cliente clienteIn = new Proxy(cliente1);
        System.out.println(clienteIn.getNome() + " " + clienteIn.getCPF());
        
        clienteIn.setNome("Maria");
        System.out.println(clienteIn.getNome() + " " + clienteIn.getCPF());
    }
    
}
