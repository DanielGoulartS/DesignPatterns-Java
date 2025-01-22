package Design_Patterns.Behavioral.Interpreter;


public class NewMain {

    public static void main(String[] args) {
        No n1 = new Valor(null, null, "1");
        No n10 = new Valor(null, null, "10");
        No n3 = new Valor(null, null, "3");
        No n4 = new Valor(null, null, "4");

        No nMultiplicacao = new Multiplicacao(null, null);
        No nSoma = new Soma(null, null);
        No nSoma2 = new Soma(null, null);


        nSoma.setEsq(n4);
        nSoma.setDir(n3);

        nSoma2.setEsq(n10);
        nSoma2.setDir(n1);

        nMultiplicacao.setEsq(nSoma2);
        nMultiplicacao.setDir(nSoma);
        
        
        Visitor visitor = new Visitor(nMultiplicacao);
        
        visitor.run(nMultiplicacao);
        visitor.resolver();
        
        
    }

}
