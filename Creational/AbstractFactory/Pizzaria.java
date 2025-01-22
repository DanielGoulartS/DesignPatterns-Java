package Design_Patterns.Creational.AbstractFactory;

public class Pizzaria {

    public static void Pizzaria(Fabrica fab) {
        if((fab.local()).equalsIgnoreCase("SP")){
            System.out.println("\n\nBem vindo à Pizzaria Paulista.\n Faça um pedido: napolitano ou calabresa: ");
        }else if((fab.local()).equalsIgnoreCase("RJ")){
            System.out.println("\n\nBem vindo à Pizzaria Carioca.\n Faça um pedido: napolitano ou calabresa: ");
        }
    }
    public static void PedirPizza(Fabrica fab, String sabor){
        fab.getPizza(sabor);
    }
    public static void getPizza(Fabrica fab){
        if((fab.local()).equalsIgnoreCase("SP")){
        System.out.println("\nA pizza chegou, vai la buscar no portão, vai, truta!!");
            System.out.println("A Pizzaria Paulistinha Agradece!!");
        }else if((fab.local()).equalsIgnoreCase("RJ")){
        System.out.println("\nA pizza chegou, vai la buscar no portão, vai, cara!!");
            System.out.println("A Pizzaria Fluminense Agradece!!");
        }
    }
    
    public static void Comprar(Fabrica fabrica, String sabor){
        Pizzaria(fabrica);
        PedirPizza(fabrica, sabor);
        getPizza(fabrica);
        System.out.println("////////////////////////////////////////");
    }
    
    public static void main(String[] args) {
        
        //Factory (Fábricas)
        //AbstractFactory tudo
        Fabrica fabricaSP = new FabricaSP();
        Fabrica fabricaRJ = new FabricaRJ();
        
        Comprar(fabricaSP, "napolitano");
        Comprar(fabricaSP, "calabresa");
        Comprar(fabricaRJ, "napolitano");
        Comprar(fabricaRJ, "calabresa");
        
    }

}
