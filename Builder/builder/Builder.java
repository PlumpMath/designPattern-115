package builder;

/**
 * Created by lzh on 3/28/16.
 */
public interface Builder {
    void buildHead();
    void buildBody();
    void buildTail();
    Ant getProduct();
}
