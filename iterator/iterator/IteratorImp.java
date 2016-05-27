

/**
 * Created by lzh on 3/31/16.
 */
public class IteratorImp implements Iterator {
    private AggregateImp aggregateImp = null;
    private int size = 0;
    private int index = 0;
    public IteratorImp(AggregateImp aggregateImp){
        this.aggregateImp = aggregateImp;
        this.size = aggregateImp.getSize();
        index = 0;
    }
    @Override
    public void next() {
        if(index < size){
            index ++;
        }
    }

    @Override
    public boolean isLast() {
        return index>=size;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public Object current() {
        return aggregateImp.getElement(index);
    }
}
