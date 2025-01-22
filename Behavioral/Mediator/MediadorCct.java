package Design_Patterns.Behavioral.Mediator;

public class MediadorCct implements Mediador {

    Component comp1;
    Component comp2;
    Component comp3;

    public MediadorCct(Component comp1, Component comp2, Component comp3) {
        this.comp1 = comp1;
        this.comp2 = comp2;
        this.comp3 = comp3;
    }

    @Override
    public boolean Notificar() {
        if (comp2.responder() && comp3.responder()) {
            return comp1.responder();
        }
        return false;
    }

}
