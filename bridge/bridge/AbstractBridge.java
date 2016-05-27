

/**
 * Created by lzh on 3/29/16.
 */
public class AbstractBridge {
    Baidu baidu;
    public AbstractBridge(Baidu baidu){
        this.baidu = baidu;
    }
    public void search(){
        baidu.search();
    }
}
