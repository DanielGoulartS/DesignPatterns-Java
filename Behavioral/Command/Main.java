package Design_Patterns.Behavioral.Command;

public class Main {

    public static void main(String[] args) {

        //Edito o documento no editor de texto
        Editor editor = new Editor("Olá glr!", 1);
        //Exibo-o
        editor.exibir();
        //Salvo na pilha de estados salvos
        editor.ExecuteCommand(new Save(editor));
        //Exibo-o novamente
        //editor.exibir();
        //Altero seus dados
        editor.setNumero(3);
        editor.setTexto("Tchauzinho!!");
        //Salvo o novo estado na pilha de estados salvos
        editor.ExecuteCommand(new Save(editor));
        //Exibo-o
        editor.exibir();
        //Desfaço, removendo o ultimo estado da pilha e restaurando o abaixo dele
        editor.ExecuteCommand(new Undo(editor));
        //Exibo-o
        editor.exibir();

    }

}
