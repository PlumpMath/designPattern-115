package iterator;

/**
 * Created by lzh on 3/31/16.
 */
public class AggregateImp extends Aggregate {
    private Object[] objects = null;
    public AggregateImp(Object[] objects){
        this.objects = objects;
    }
    public Object getElement(int index){
        if(index < objects.length){
            return objects[index];
        }else {
            return null;
        }
    }
    @Override
    public Iterator createIterator() {
        return new IteratorImp(this);
    }
    public int getSize(){
        return objects.length;
    }
}
