/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Design_Patterns.Behavioral.TemplateMethod;

/**
 *
 * @author Daniel
 */
public class SistemaWEB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pagina home = new Home();
        Pagina noticias = new Noticias();
        Pagina noticia = new Noticia();
        
        home.build();
        noticias.build();
        noticia.build();
        
    }
    
}
