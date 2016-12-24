package command;

/**
 * Created by lzh on 4/1/16.
 */
public class Sleep implements Command {
    private Lzh lzh;
    public Sleep(Lzh lzh){
        this.lzh = lzh;
    }
    @Override
    public void execute() {
        lzh.sleep();
    }
}
