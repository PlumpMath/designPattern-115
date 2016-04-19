
/**
 * Created by lzh on 3/31/16.
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObserver(String msg);
}
