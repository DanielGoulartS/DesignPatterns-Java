/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Composite;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Caixa implements Pedido {

    public int codigo;
    public String nome;
    public ArrayList<Pedido> conteudos;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    public void inserir(Pedido item) {
        this.conteudos.add(item);
    }

    public void getItens() {

        if (this instanceof Caixa) {
            System.out.print(this.getNome() + " : " + this.getCodigo());
            System.out.print("[\n");
            if (this.conteudos.isEmpty()) {
                System.out.println("Caixa Vazia!");
            } else {
                for (Pedido cont : this.conteudos) {
                    if (cont instanceof Caixa) {
                        ((Caixa) cont).getItens();
                    } else {
                        System.out.println(cont.getNome() + " : " + cont.getCodigo());
                    }
                }
            }
            System.out.println("]");
        }
    }

    public Caixa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.conteudos = new ArrayList<>();
    }
}
