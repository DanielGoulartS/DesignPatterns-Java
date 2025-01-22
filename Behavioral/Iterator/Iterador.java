
package Design_Patterns.Behavioral.Iterator;

import java.util.Iterator;

public class Iterador {
    
    public void exibir(Iterator<Pessoa> iterator){
        
        while(iterator.hasNext()){
            Pessoa p = iterator.next();
            System.out.println(p.CPF + " : " + p.nome);
        }
        
    }
    
}
