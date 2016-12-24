
package observer;
import java.util.ArrayList;

/**
 * Created by lzh on 3/31/16.
 */
public class SubjectImp implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        if( !observers.contains(observer) ){
            observers.add(observer);
            System.out.println(observer+"is added");
        }else {
            throw new RuntimeException(observer+" is already in this Subject");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            System.out.println(observer+"is remove");
        }else {
            throw new RuntimeException(observer+" is not in this Subject,please add first");
        }
    }

    @Override
    public void updateObserver(String msg) {
        for(Observer observer:observers){
            observer.update(msg);
        }
    }
}
