package abstractFactory.impl;

import abstractFactory.AbstractFactory;
import abstractFactory.Button;
import abstractFactory.Panel;

/**
 * Created by lzh on 16-6-10.
 */
public class FactoryImpl implements AbstractFactory{
    private Button button = null;
    private Panel panel = null;
    public FactoryImpl(){
        try {
            button = ButtonImpl.class.newInstance();
            panel = PanelImpl.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void windows() {
        panel.windowsPanel();
        button.windowsButton();
    }

    @Override
    public void linux() {
        panel.linuxPanel();
        button.linuxButton();
    }
}
