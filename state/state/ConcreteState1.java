package state;
/**
 * Created by lzh on 4/1/16.
 * 状态模式
 */
public class ConcreteState1 implements State {
    @Override
    public void handle(String handle) {
        System.out.println(handle);
        System.out.println(ConcreteState1.class.getName());
    }
}
