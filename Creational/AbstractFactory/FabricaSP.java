package Design_Patterns.Creational.AbstractFactory;

public class FabricaSP implements Fabrica {

    @Override
    public String local() {
        return "SP";
    }

    @Override
    public Pizza getPizza(String sabor) {
        if (sabor.equalsIgnoreCase("napolitano")) {
            Pizza pnp = new PizzaNapolitano();
            pnp.Preparar();
            pnp.Assar();
            pnp.Cortar();
            pnp.Embalar();
            return pnp;

        } else if (sabor.equalsIgnoreCase("calabresa")) {
            Pizza pcp = new PizzaCalabresa();
            pcp.Preparar();
            pcp.Assar();
            pcp.Cortar();
            pcp.Embalar();
            return pcp;

        } else {
            System.out.println("Sabor Não Reconhecido.");
            return null;
        }
    }
}
