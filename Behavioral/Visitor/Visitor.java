
package Design_Patterns.Behavioral.Visitor;


public class Visitor {
    
    void Rotina(No no){
        if(no instanceof Estrada){
            System.out.println("A Estrada " + ((Estrada) no).nome + "  tem "
            + ((Estrada) no).km + "Kilômetros.");
        }
        if(no instanceof Local){
            System.out.println("O local " + ((Local) no).nome + " tem capacidade para "
            + ((Local) no).capacidade + " pessoas, e é um excelente " + ((Local) no).tipo + ".");
        }
    }
    
    void Visitar(No raiz){
        if(raiz.getE() != null){
            Visitar(raiz.getE());
        }
        
        Rotina(raiz);
        
        if(raiz.getD() != null){
            Visitar(raiz.getD());
        }
        
    }
    
}
