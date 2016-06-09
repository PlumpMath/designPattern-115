package prototype;

/**
 * Created by lzh on 3/29/16.
 */
public class Prototype implements Cloneable {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
