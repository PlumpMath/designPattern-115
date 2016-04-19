
import java.util.ArrayList;

/**
 * Created by lzh on 3/30/16.
 */
public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();
    public Composite(String msg) {
        super(msg);
    }

    @Override
    public void add(Component component) {
        super.add(component);
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        super.remove(component);
        if(components.contains(component)){
            components.remove(component);
        }
    }

    @Override
    public void printAll() {
        super.printAll();
        for (Component c:components) {
            System.out.println(c.msg);
        }
    }
}
