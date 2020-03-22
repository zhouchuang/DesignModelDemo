package Decoration;

/**
 * @author zhouchuang
 * @create 2020-03-22 21:32
 */
public abstract class Finery extends Person  {
    private Person component;
    public void decoration(Person component){
        this.component  = component;
    }
    public void show(){
        modelling();
        if(component!=null){
            this.component.show();
        }
    }

    protected abstract void modelling();
}
