/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Observer;

/**
 *
 * @author Daniel
 */
public class ProdEstoque extends Dados{
    
    int a;
    int b;
    int c;
    
    public ProdEstoque(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        notificar();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        notificar();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
        notificar();
    }
}
