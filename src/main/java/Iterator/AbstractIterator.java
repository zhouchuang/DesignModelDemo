package Iterator;

public abstract class AbstractIterator<E,T>  implements Iterator{
    protected int index=0;

    protected E aggregate ;

    public AbstractIterator(E aggregate) {
        this.aggregate  = aggregate;
    }
}
