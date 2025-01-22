package Design_Patterns.Creational.AbstractFactory;

public class PizzaCalabresa implements Pizza {

    @Override
    public void Preparar() {
        System.out.println("Adicionando linguicinhas, camarada...");
    }

    @Override
    public void Assar() {
        System.out.println("Esquentando...");
    }

    @Override
    public void Cortar() {
        System.out.println("Cortando em fatias!");
    }

    @Override
    public void Embalar() {
        System.out.println("Na caixinha!");
    }

}
