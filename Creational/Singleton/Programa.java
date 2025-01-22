package Design_Patterns.Creational.Singleton;

import Design_Patterns.Creational.Singleton.Singleton;

public class Programa {

    public static void main(String[] args) {
        Singleton newSing = Singleton.GetInstance();
        System.out.println(newSing.getData());
        newSing.setData(newSing.getData()+1);
        
        Singleton sameSing = Singleton.GetInstance();
        System.out.println(sameSing.getData());
        sameSing.setData(sameSing.getData()+1);
        
        Singleton lastSing = Singleton.GetInstance();
        System.out.println(lastSing.getData());
        lastSing.setData(lastSing.getData()-1);
        System.out.println(lastSing.getData());
    }
    
}
