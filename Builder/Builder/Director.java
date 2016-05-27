


/**
 * Created by lzh on 3/28/16.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Ant buildAnt(){
        builder.buildHead();
        builder.buildBody();
        builder.buildTail();
        return builder.getProduct();
    }
}
