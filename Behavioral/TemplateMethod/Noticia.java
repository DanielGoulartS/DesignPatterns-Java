/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.TemplateMethod;

/**
 *
 * @author Daniel
 */
public class Noticia extends Pagina {

    @Override
    void Header() {
        System.out.println("Menu Pesquisar, essas coisas...");
    }

    @Override
    void Body() {
        System.out.println("Paragrafo de notícia escrita...");
    }

    @Override
    void Footer() {
        System.out.println("Links e patrocinadores...");
    }

}
