package Design_Patterns.Creational.Singleton;

public class Singleton {

    private static Singleton novoSingleton;
    private int data;

    private Singleton() {
        data = 0;
    }

    public static Singleton GetInstance() {
        if(novoSingleton == null){
            novoSingleton = new Singleton();
        }
        return novoSingleton;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
