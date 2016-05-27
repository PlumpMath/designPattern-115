

/**
 * Created by lzh on 3/30/16.
 */
public class Test {
    public static void main(String[] args) {
        Context say = new Context(new Say());
        Context eat = new Context(new Eat());
        Context walk = new Context(new Walk());
        say.action();
        eat.action();
        walk.action();
    }
}
