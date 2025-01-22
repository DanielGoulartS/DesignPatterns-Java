package Design_Patterns.Creational.AbstractFactory;

public class PizzaNapolitano implements Pizza {

    @Override
    public void Preparar() {
        System.out.println("Adicionando presuntinho e outros mais, camarada...");
    }

    @Override
    public void Assar() {
        System.out.println("Ixxquentando...");
    }

    @Override
    public void Cortar() {
        System.out.println("Cortando em fatias generosas!");
    }

    @Override
    public void Embalar() {
        System.out.println("Na caixinha, meu patrão!");
    }

}
