package memento.test;

import memento.Caretaker;
import memento.Originator;

/**
 * Created by lzh on 4/1/16.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(originator.createMemento("令照辉真帅"));
        System.out.println(caretaker.getMemento().getMsg());
    }
}
