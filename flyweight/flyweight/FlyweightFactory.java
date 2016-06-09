package flyweight;

import java.util.Hashtable;

/**
 * Created by lzh on 3/30/16.
 * 享元工厂
 */
public class FlyweightFactory {
    private static Hashtable<String,Flyweight> flyweights = new Hashtable<>();
    public static Flyweight factory(String in){
        Flyweight flyweight ;
        flyweight = flyweights.get(in);
        if(null == flyweight){
            flyweight = new ConcreteFlyweight(in);
            flyweights.put(in,flyweight);
        }
        return flyweight;
    }

}
