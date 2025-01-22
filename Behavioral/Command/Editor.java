package Design_Patterns.Behavioral.Command;

import java.util.Stack;

public class Editor {

    String texto;
    int numero;
    Stack saves;

    public Editor(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
        this.saves = new Stack<Save>();
    }
    
    void exibir(){
        System.out.println(this.texto +" : "+ this.numero);
    }
    
    public void ExecuteCommand(Command c){
        c.execute();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

}
