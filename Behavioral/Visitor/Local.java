
package Design_Patterns.Behavioral.Visitor;

public class Local implements No{
    
    No E;
    No D;
    String nome;
    String tipo;
    int capacidade;
    
    Local(No E, No D, String nome, String tipo, int capacidade){
        this.E = E;
        this.D = D;
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    @Override
    public No getE() {
        return this.E;
    }

    @Override
    public void setE(No E) {
        this.E = E;
    }

    @Override
    public No getD() {
        return this.D;
    }

    @Override
    public void setD(No D) {
        this.D = D;
    }
}
