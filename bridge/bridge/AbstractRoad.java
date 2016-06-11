package bridge;

/**
 * Created by lzh on 16-6-11.
 */
public abstract class AbstractRoad {
    private AbstractCar car = null;
    public abstract void run();
    public void setCar(AbstractCar car){
        this.car = car;
    }

    public AbstractCar getCar() {
        return car;
    }
}
