

/**
 * Created by lzh on 3/31/16.
 */
public class Test {
    public static void main(String[] args) {
        Command eat = new Eat(new Lzh() {
            @Override
            public void eat() {
                super.eat();
            }
        });
        eat.execute();
        Command sleep = new Sleep(new Lzh() {
            @Override
            public void sleep() {
                super.sleep();
            }
        });
        sleep.execute();
        Command walk = new Walk(new Lzh() {
            @Override
            public void walk() {
                super.walk();
            }
        });
        walk.execute();
    }
}
