
package Design_Patterns.Behavioral.Command;

public class Save implements Command {

    String texto;
    int num;
    Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
        this.texto = editor.texto;
        this.num = editor.numero;
    }
    
    
    
    @Override
    public void execute() {
        editor.saves.push(new Save(editor));
    }
    
    
    
}
