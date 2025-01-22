
package Design_Patterns.Behavioral.Visitor;

public class Estrada implements No{
    
    No E;
    No D;
    String nome;
    int km;

    public Estrada(No E, No D, String nome, int km) {
        this.E = E;
        this.D = D;
        this.nome = nome;
        this.km = km;
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
