
package Design_Patterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewMain {

    public static void main(String[] args) {
        
        Iterador iterador = new Iterador();
        
        Pessoa alberto = new Pessoa("Alberto", 10, 179);
        Pessoa cicero = new Pessoa("Cícero", 11, 188);
        Pessoa sandro = new Pessoa("Sandro", 14, 147);
        
        
        
        Map<Integer,Pessoa> pessoasMap = new HashMap<>();
        
        pessoasMap.put(179, alberto);
        pessoasMap.put(188, cicero);
        pessoasMap.put(147, sandro);
        
        
        
        ArrayList<Pessoa> pessoasList = new ArrayList<>();
        
        pessoasList.add(alberto);
        pessoasList.add(cicero);
        pessoasList.add(sandro);
        
        
        iterador.exibir(pessoasMap.values().iterator());
        iterador.exibir(pessoasList.iterator());
        
    }
    
}
