package Iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {


    private int index=0;

    List<T> list  ;

    public ListIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index<(list.size())?true:false;
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
