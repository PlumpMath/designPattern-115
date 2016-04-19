

/**
 * Created by lzh on 3/31/16.
 */
public class ConcreteHandler extends Handler {
    @Override
    public void requestHandler() {
        if(getHandler() != null){
            System.out.println("let off request");
            getHandler().requestHandler();
        }else {
            System.out.println("deal with request");
        }
    }
}
