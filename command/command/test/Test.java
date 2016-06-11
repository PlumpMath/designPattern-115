package command.test;


import command.*;

/**
 * Created by lzh on 3/31/16.
 */
public class Test {
    public static void main(String[] args) {
        Lzh lzh = new Lzh();
        Command eat = new Eat(lzh);
        Command sleep = new Sleep(lzh);
        Command walk = new Walk(lzh);
        eat.execute();
        sleep.execute();
        walk.execute();
    }
}
