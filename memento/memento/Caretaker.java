/**
 * Created by lzh on 4/1/16.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}
