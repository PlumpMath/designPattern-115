package builder.test;


import builder.*;

/**
 * Created by lzh on 3/28/16.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new BuilderImp();
        Director director = new Director(builder);
        System.out.println("begin build.......");
        Ant ant = director.buildAnt();
        System.out.println("build end");
        System.out.println(ant.getHead()+"\n"+ant.getBody()+"\n"+ant.getTail());
    }
}
