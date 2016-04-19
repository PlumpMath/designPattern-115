

/**
 * Created by lzh on 3/30/16.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void action(){
        strategy.doSomething();
    }
}
