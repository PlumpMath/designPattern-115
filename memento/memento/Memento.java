package memento;
/**
 * Created by lzh on 4/1/16.
 */
public class Memento {
    private String msg;
    public Memento(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
