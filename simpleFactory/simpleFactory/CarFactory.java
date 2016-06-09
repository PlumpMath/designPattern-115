
package simpleFactory;

/**
 * Created by lzh on 3/28/16.
 */
public interface CarFactory {
    Car getCar(Class<? extends Car> clasz);
}
