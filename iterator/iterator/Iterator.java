package iterator;

/**
 * Created by lzh on 3/31/16.
 */
public interface Iterator {
    void next();
    boolean isLast();
    void first();
    Object current();
}
