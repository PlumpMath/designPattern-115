
package simpleFactory;

/**
 * Created by lzh on 3/28/16.
 */
public class RollsRoyce implements Car {
    public String name() {
        return "RollsRoyce";
    }

    public String color() {
        return "green";
    }

    public int pay() {
        return 3000;
    }
}
