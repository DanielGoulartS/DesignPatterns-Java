
package Design_Patterns.Behavioral.State;


public class Game {

    public static void main(String[] args) {
        
        //Contexto Personagem, Estados Equipamentos, Vantagem, modificar os status com base no estado/equipamento
        //que se utiliza, sem grandes estruturas lógicas if else switch na classe;
        
        Player personagem = new Player();
        
        Equipamento escudo = new Escudo("Escudo Cavaleiro");
        Equipamento espada = new Espada("Espada Longa");
        Equipamento arma = new Pistola("Arma de prata");
        
        personagem.equipar(espada);
        personagem.Lutar();
        
        personagem.equipar(escudo);
        personagem.Lutar();
        
        personagem.equipar(arma);
        personagem.Lutar();
        
    }
    
}
