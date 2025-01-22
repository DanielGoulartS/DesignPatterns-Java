
package Design_Patterns.Behavioral.Command;

public class Undo implements Command{

    Editor editor;
    
    public Undo(Editor editor) {
        this.editor = editor;
    }

    
    
    @Override
    public void execute() {
        editor.saves.pop();
        Save save = (Save) editor.saves.lastElement();
        editor.setTexto(save.texto);
        editor.setNumero(save.num);
    }
    
    
    
}
