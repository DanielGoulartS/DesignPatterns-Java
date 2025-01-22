package Design_Patterns.Structural.Bridge;

public class Main {

    public static void main(String[] args) {
        
        
        Linux linux = new Linux();
        Windows windows = new Windows();
        Android android = new Android();
        
        Programa programa = new Programa(0, 0, linux);
        programa.setSettings(10, 10);
        
        programa.setSo(windows);
        programa.setSettings(8, 8);
        
        programa.setSo(android);
        programa.setSettings(7, 5);
        
        //Permite uma variedade de implementações de algoritmos em diferentes sistemas operacionais
        
        
    }
}