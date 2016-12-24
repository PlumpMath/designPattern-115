package flyweight;

/**
 * Created by lzh on 3/30/16.
 * 具体享元
 */
public class ConcreteFlyweight implements Flyweight{
    String in;

    /**
     *
     * @param in  内部享元
     */
    public ConcreteFlyweight(String in){
        this.in = in;
    }

    /**
     *
     * @param out 外部享元
     */
    @Override
    public void say(String out) {
        System.out.println(out+": i am out  ");
        System.out.println(in+":i am in ");
    }
}
