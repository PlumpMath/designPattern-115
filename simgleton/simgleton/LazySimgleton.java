package simgleton;

/**
 * Created by lzh on 3/30/16.
 */
public class LazySimgleton {
    private static LazySimgleton lazySimgleton = null;
    private LazySimgleton(){}
    public static LazySimgleton getInstance(){
        //线程不安全
//        if(lazySimgleton == null){
//            lazySimgleton = new LazySimgleton();
//        }
        //线程安全
        if(lazySimgleton == null){
            synchronized(LazySimgleton.class){
                if(lazySimgleton == null){
                    lazySimgleton = new LazySimgleton();
                }
            }
        }
        return lazySimgleton;
    }
    public void say(){
        System.out.println("i am lazy");
    }
}
