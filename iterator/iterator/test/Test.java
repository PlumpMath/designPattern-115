package iterator.test;

import iterator.AggregateImp;
import iterator.Iterator;

/**
 * Created by lzh on 3/31/16.
 * 迭代子模式
 */
public class Test {
    public static void main(String[] args) {
        Object[] object = {1,2,3,4,5,6,7};
        AggregateImp aggregateImp = new AggregateImp(object);
        Iterator iterator = aggregateImp.createIterator();
        while(!iterator.isLast()){
            System.out.print(iterator.current()+"\t");
            iterator.next();
        }
    }
}
