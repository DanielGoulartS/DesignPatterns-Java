
package Design_Patterns.Behavioral.Memento;


public class NewMain {

    public static void main(String[] args) throws InterruptedException {
        Item computador = new Item("Computador", 1, 300);
        Item mouse = new Item("Mouse", 1, 203);
        Item banana = new Item("Banana", 2, 110);
        
        Compra c1 = new Compra(1);
        c1.addItem(computador);
        c1.addItem(mouse);
        
        Compra c1backup = c1.createMemento();
        
        c1.addItem(banana);
        
        for(Item item : c1.itens){
            System.out.println(item.getNome());
        }
        
        Thread.sleep(100);
        
        c1.restoreMemento(c1backup);
        
        for(Item item : c1.itens){
            System.err.println(item.getNome());
        }
    }
    
}
