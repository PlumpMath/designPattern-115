

/**
 * Created by lzh on 3/29/16.
 */
public class Test {
    /**
     * 外观模式
     * @param args
     */
    public static void main(String[] args) {
        Baidu baidu = new BaiduImp();
        baidu.computerShutdown();
        baidu.searchSomething();
    }
}
