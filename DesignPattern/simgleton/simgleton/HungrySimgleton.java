

/**
 * Created by lzh on 3/30/16.
 */
public class HungrySimgleton {
    private static final HungrySimgleton HUNGRY_SIMGLETON = new HungrySimgleton();
    private HungrySimgleton(){

    }
    public static final HungrySimgleton getInstance(){
        return HungrySimgleton.HUNGRY_SIMGLETON;
    }
    public void say(){
        System.out.println("i am hungry");
    }
}
