/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Structural.Facade;

/**
 *
 * @author Daniel
 */
public class Pizzaria {
    
    FazMassa fazMassa;
    Temperador temperador;
    Embalador embalador;
    
    public Pizzaria(FazMassa fazMassa, Temperador temperador, Embalador embalador){
        
        this.fazMassa = fazMassa;
        this.temperador = temperador;
        this.embalador = embalador;
        
    }
    
    public void PrepararPizza(){
        
        this.fazMassa.FazMassa();
        this.temperador.Temperar();
        this.embalador.Embalar();
        
    }
    
}
