package observer.test;

import observer.Observer;
import observer.ObserverImp;
import observer.Subject;
import observer.SubjectImp;

/**
 * Created by lzh on 3/30/16.
 */
public class Test {
    public static void main(String[] args) {
        Observer observer = new ObserverImp();
        Subject subject = new SubjectImp();
        subject.addObserver(observer);
        subject.updateObserver("lzh");
        subject.removeObserver(observer);
    }
}
