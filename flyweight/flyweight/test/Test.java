package flyweight.test;

import flyweight.Flyweight;
import flyweight.FlyweightFactory;

/**
 * Created by lzh on 3/30/16.
 */
public class Test {
    public static void main(String[] args) {
        Flyweight flyweight  = FlyweightFactory.factory("lzh");
        flyweight.say("out");
    }
}
