package Design_Patterns.Structural.Bridge;

public class Windows implements Sistema{

    int brilho, volume;

    public int getbrilho() {
        return brilho;
    }

    public void setbrilho(int brilho) {
        this.brilho = brilho;
        System.out.println("Brilho do dispositivo Windows = " + brilho);
    }

    public int getvolume() {
        return volume;
    }

    public void setvolume(int volume) {
        this.volume = volume;
        System.out.println("Volume do dispositivo Windows = " + volume);
    }
}