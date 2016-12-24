
package proxy;
/**
 * Created by lzh on 3/29/16.
 */
public class Proxy implements Person {
    private Person person = new Real();
    @Override
    public void say() {
        person.say();
    }
}
