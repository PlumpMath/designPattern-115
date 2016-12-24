package bridge;

/**
 * Created by lzh on 16-6-11.
 */
public class Street extends AbstractRoad {

    @Override
    public void run() {
        super.getCar().run();
        System.out.println(super.getCar().getClass().getName()+" run on street");
    }
}
