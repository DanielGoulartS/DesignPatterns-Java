/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Interpreter;

/**
 *
 * @author Daniel
 */
public class Divisao implements No{
    
    No Esq;
    No Dir;
    String Value;

    public Divisao(No Esq, No Dir) {
        this.Esq = Esq;
        this.Dir = Dir;
        this.Value = "/";
    }

    @Override
    public No getEsq() {
        return this.Esq;
    }

    @Override
    public No getDir() {
        return this.Dir;
    }

    @Override
    public String getValue() {
        return this.Value;
    }

    @Override
    public void setEsq(No esq) {
        this.Esq = esq;
    }

    @Override
    public void setDir(No dir) {
        this.Dir = dir;
    }

    @Override
    public void setValue(String value) {
        this.Value = value;
    }

    @Override
    public int Operar(int n1, int n2) {
        return n1 / n2;
    }

}
