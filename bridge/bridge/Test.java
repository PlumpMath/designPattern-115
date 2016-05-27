

/**
 * Created by lzh on 3/29/16.
 */
public class Test {
    /**
     * 桥接模式，区别适配器模式
     * @param args
     */
    public static void main(String[] args) {
        Baidu baiduOne = new BaiduOne();
//        Baidu baiduTwo = new BaiduTwo();
        BridgeOne bridgeOne = new BridgeOne(baiduOne);
        bridgeOne.search();
        bridgeOne.result();
    }
}
