package state;
/**
 * Created by lzh on 4/1/16.
 * 状态模式
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    public void handle(String handle){
        state.handle(handle);
    }
}
