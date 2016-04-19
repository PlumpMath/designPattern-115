

/**
 * Created by lzh on 4/1/16.
 */
public class Walk implements Command {
    private Lzh lzh;
    public Walk(Lzh lzh){
        this.lzh = lzh;
    }
    @Override
    public void execute() {
        lzh.walk();
    }
}
