
package simpleFactory;

/**
 * Created by lzh on 3/28/16.
 */
public class Ferrari implements Car {
    public String name() {
        return "Ferrari";
    }

    public String color() {
        return "red";
    }

    public int pay() {
        return 2000;
    }
}
