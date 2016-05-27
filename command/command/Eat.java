

/**
 * Created by lzh on 4/1/16.
 */
public class Eat implements Command {
    private Lzh lzh;
    public Eat(Lzh lzh){
        this.lzh = lzh;
    }
    @Override
    public void execute() {
        lzh.eat();
    }
}
