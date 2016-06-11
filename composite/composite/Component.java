package composite;

/**
 * Created by lzh on 3/30/16.
 * 组合模式。
 */
public abstract class Component {
    String msg;
    public Component(String msg){
        this.msg  = msg;
    }
    public void add(Component component){

    }
    public void remove(Component component){

    }
    public void printAll(){

    }
}
