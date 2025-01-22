package Design_Patterns.Structural.Bridge;

public class Programa implements Software {

    int volume;
    int brilho;
    Sistema so;

    public Programa(int volume, int brilho, Sistema so) {
        this.volume = volume;
        this.brilho = brilho;
        this.so = so;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public Sistema getSo() {
        return so;
    }

    public void setSo(Sistema so) {
        System.out.println("Mudando para a versão do Sistema Operacional escolhido: ");
        this.so = so;
    }

    @Override
    public void setSettings(int brilho, int volume) {
        this.so.setbrilho(brilho);
        this.so.setvolume(volume);
        
    }
    

}
