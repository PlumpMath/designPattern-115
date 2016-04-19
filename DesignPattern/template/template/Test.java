

/**
 * Created by lzh on 3/30/16.
 *模板方法模式
 */
public class Test {
    public static void main(String[] args) {
        AbstractFather lzh01 = new LZH_1();
        AbstractFather lzh02 = new LZH_2();
        lzh01.sleep();
        lzh02.eat();
    }
}
