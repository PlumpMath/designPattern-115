

/**
 * Created by lzh on 3/29/16.
 */
public class ChangeOne extends Change {
    public ChangeOne(Decorate decorate) {
        super(decorate);
    }
    @Override
    public void act() {
        super.act();
        say();
        System.out.println("ChangeOne");
    }
    public void say(){
        System.out.println("say");
    }
}
