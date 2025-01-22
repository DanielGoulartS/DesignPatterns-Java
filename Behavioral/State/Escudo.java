/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.State;

/**
 *
 * @author Daniel
 */
public class Escudo implements Equipamento {

    String nome;

    public Escudo(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String Responder() {
        return "Impacto mitigado com o escudo.";
    }

}
