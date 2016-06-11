package command;

/**
 * 具体命令。
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
