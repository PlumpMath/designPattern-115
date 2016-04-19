/**
 * Created by lzh on 4/1/16.
 * 备忘录模式
 */
public class Originator {
    private String msg;
    public Memento createMemento(String msg){
        this.msg = msg;
        return new Memento(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
