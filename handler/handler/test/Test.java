package handler.test;

import handler.ConcreteHandler;
import handler.Handler;

/**
 * Created by lzh on 3/31/16.
 */
public class Test {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setHandler(handler2);
        handler1.requestHandler();
    }
}
