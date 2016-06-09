package composite.test;

import composite.Component;
import composite.Composite;
import composite.Part;

/**
 * Created by lzh on 3/30/16.
 */
public class Test {
    /**
     * 组合模式
     * @param args
     */
    public static void main(String[] args) {
        Component composite =  new Composite("composite");
        Component component_lzh = new Part("lzh");
        Component component_ct = new Part("ct");
        composite.add(component_lzh);
        composite.add(component_ct);
        composite.printAll();
    }
}
