package decorate;

/**
 * Created by lzh on 3/29/16.
 */
public class Change implements Decorate{
    private Decorate decorate;
    public Change(Decorate decorate){
        this.decorate = decorate;
    }

    @Override
    public void act() {

    }
}
