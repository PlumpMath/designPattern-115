
/**
 * Created by lzh on 3/31/16.
 * 责任链模式
 */
public abstract class Handler {
    private Handler handler;
    public abstract void requestHandler();

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Handler getHandler() {
        return handler;
    }
}
