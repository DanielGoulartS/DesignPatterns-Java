/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns.Behavioral.Interpreter;

/**
 *
 * @author Daniel
 */
public interface No {
    
    No getEsq();
    No getDir();
    String getValue();
    int Operar(int n1, int n2);
    
    void setEsq(No esq);
    void setDir(No dir);
    void setValue(String value);
}
