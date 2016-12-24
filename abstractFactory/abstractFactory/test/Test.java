package abstractFactory.test;

import abstractFactory.AbstractFactory;
import abstractFactory.impl.FactoryImpl;

/**
 * Created by lzh on 16-6-10.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryImpl();
        factory.linux();
        factory.windows();
    }
}
