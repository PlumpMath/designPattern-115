package state.test;

import state.ConcreteState1;
import state.ConcreteState2;
import state.Context;

/**
 * Created by lzh on 4/1/16.
 * 状态模式
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.handle("lzh");
        context.setState(new ConcreteState2());
        context.handle("ct");
    }
}
