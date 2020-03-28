package Chain;

public abstract class Chain {
    protected String name;
    protected int limit;

    public Chain(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    protected Chain next;

    public Chain setNext(Chain next) {
        this.next = next;
        return this;
    }

    public void process(int num) {
        if(num>limit){
            next.process(num);
        }else{
            System.out.println(name+"执行借款审批"+num);
        }
    }
}
