/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Creational.Factory;

/**
 *
 * @author Daniel
 */
public class GraficoV implements Calculadora{

    @Override
    public String Mostrar(int dado) {
        String resp = "";
        for(int i = 0; i < dado; i++)
            resp += "\n  |";
        resp += "\n  Valor:";
        return resp;
    }
    
}
