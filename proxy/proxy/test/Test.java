
package proxy.test;

import proxy.Person;
import proxy.Proxy;

/**
 * Created by lzh on 3/29/16.
 * 代理模式
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Proxy();
        person.say();
    }
}
