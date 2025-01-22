/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Interpreter;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Visitor {

    ArrayList<String> operacao = new ArrayList<>();
    No raiz;

    public Visitor(No raiz) {
        this.raiz = raiz;
    }

    
    String resolver() {
        System.out.print(operacao + " = " +raiz.getValue());
        return raiz.getValue();
    }

    void run(No raiz) {

        if (raiz.getEsq() != null) {
            run(raiz.getEsq());
        }

        operacao.add(raiz.getValue());

        if (raiz.getDir() != null) {
            run(raiz.getDir());
        }

        if (raiz.getEsq() != null && raiz.getDir() != null) {

            int n1 = Integer.parseInt(raiz.getEsq().getValue());
            int n2 = Integer.parseInt(raiz.getDir().getValue());

            int valor = raiz.Operar(n1, n2);
            raiz.setValue(String.valueOf(valor));
        }

    }

}
