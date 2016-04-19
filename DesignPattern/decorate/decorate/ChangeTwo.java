

/**
 * Created by lzh on 3/29/16.
 */
public class ChangeTwo extends Change {
    public ChangeTwo(Decorate decorate) {
        super(decorate);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("changeTwo");
    }
}
