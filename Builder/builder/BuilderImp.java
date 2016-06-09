package builder;


/**
 * Created by lzh on 3/28/16.
 */
public class BuilderImp implements Builder {
    private Ant ant = new Ant();
    @Override
    public void buildHead() {
        ant.setHead("head");
    }

    @Override
    public void buildBody() {
        ant.setBody("body");
    }

    @Override
    public void buildTail() {
        ant.setTail("tail");
    }

    @Override
    public Ant getProduct() {
        return ant;
    }
}
