package Design_Patterns.Behavioral.TemplateMethod;

public abstract class Pagina {
    
    abstract void Header();
    abstract void Body();
    abstract void Footer();
    
    public void build(){
        Header();
        Body();
        Footer();
    }
    
}
