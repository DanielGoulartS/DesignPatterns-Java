package Design_Patterns.Creational.AbstractFactory;

public class FabricaRJ implements Fabrica {

    @Override
    public String local() {
        return "RJ";
    }

    @Override
    public Pizza getPizza(String sabor) {
        if (sabor.equalsIgnoreCase("napolitano")) {
            Pizza pnc = new PizzaNapolitano();
            pnc.Preparar();
            pnc.Assar();
            pnc.Cortar();
            pnc.Embalar();
            return pnc;

        } else if (sabor.equalsIgnoreCase("calabresa")) {
            Pizza pcc = new PizzaCalabresa();
            pcc.Preparar();
            pcc.Assar();
            pcc.Cortar();
            pcc.Embalar();
            return pcc;

        } else {
            System.out.println("Sabor Não Reconhecido.");
            return null;
        }
    }
}
