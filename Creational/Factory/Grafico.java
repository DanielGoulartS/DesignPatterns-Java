package Design_Patterns.Creational.Factory;

public class Grafico implements Calculadora {

    @Override
    public String Mostrar(int dado) {
        String resp = "Valor: ";

        for (int i = 0; i < dado; i++) {
            resp += ("=");
        }

        return resp;
    }

}
