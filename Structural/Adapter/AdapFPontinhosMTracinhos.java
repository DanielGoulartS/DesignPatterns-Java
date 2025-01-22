package Design_Patterns.Structural.Adapter;


public class AdapFPontinhosMTracinhos extends FemeaPontinhos {

    public FemeaTracinhos novafemea;

    public AdapFPontinhosMTracinhos(FemeaTracinhos novafemea) {
        this.novafemea = novafemea;
    }
    
    @Override
    public void ConectarP() {
        novafemea.ConectarT();
    }
    
}