
package simgleton.test;

import simgleton.HungrySimgleton;
import simgleton.LazySimgleton;

/**
 * Created by lzh on 3/30/16.
 */
public class Test {
    public static void main(String[] args) {
        //懒汉模式
        LazySimgleton lazySimgleton = LazySimgleton.getInstance();
        lazySimgleton.say();
        //饿汉模式
        HungrySimgleton hungrySimgleton = HungrySimgleton.getInstance();
        hungrySimgleton.say();
    }
}
