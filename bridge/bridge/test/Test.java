package bridge.test;

import bridge.AbstractRoad;
import bridge.Car;
import bridge.Street;

/**
 * Created by lzh on 16-6-11.
 */
public class Test {
    public static void main(String[] args) {
        AbstractRoad abstractRoad = new Street();
        abstractRoad.setCar(new Car());
        abstractRoad.run();
    }
}
