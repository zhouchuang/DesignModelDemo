package Iterator;

public class ProvinceIterator extends AbstractIterator<Province,String> {

    public ProvinceIterator(Province aggregate) {
        super(aggregate);
    }

    @Override
    public boolean hasNext() {
        return index<(aggregate.getProvices().size())?true:false;
    }

    @Override
    public String next() {
        return aggregate.getProvices().get(index++);
    }
}
