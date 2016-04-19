

/**
 * Created by lzh on 3/29/16.
 */
public class PrototypeSub extends Prototype {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void say(){
        System.out.println("hello world "+name);
    }
}
