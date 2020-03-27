package Iterator;

public class BoxIterator extends AbstractIterator<Box,String> {

    public BoxIterator(Box aggregate) {
        super(aggregate);
    }


    @Override
    public boolean hasNext() {
        return index<(aggregate.getList().size())?true:false;
    }

    @Override
    public String next() {
        return aggregate.getList().get(index++);
    }
}
