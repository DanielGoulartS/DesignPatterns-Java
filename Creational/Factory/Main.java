/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Creational.Factory;

/**
 *
 * @author Daniel
 */
public class Main {

    static String Mostrar(Calculadora calc, int dado) {
        System.out.println("\n\n O número escolhido foi : " + dado);
        String resp = calc.Mostrar(dado);
        return resp;
    }

    public static void main(String[] args) {
        Calculadora c1 = new Grafico();
        Calculadora c2 = new GraficoV();

        System.out.println(Mostrar(c1, 3));
        System.out.println(Mostrar(c2, 5));

    }

}
