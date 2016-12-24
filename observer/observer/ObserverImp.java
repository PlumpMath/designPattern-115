package observer;

/**
 * Created by lzh on 3/31/16.
 */
public class ObserverImp implements Observer{
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
