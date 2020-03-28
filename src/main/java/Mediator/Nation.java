package Mediator;

public abstract class Nation {
    protected UnitedNations unitedNations;
    protected String name;

    public void delcare(String msg) {
        unitedNations.declare(msg,this);
    }

    public void accept(String msg) {
        System.out.println(name+"接收到申明："+msg);
    }
}
