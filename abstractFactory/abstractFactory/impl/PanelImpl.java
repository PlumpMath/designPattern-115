package abstractFactory.impl;

import abstractFactory.Panel;

/**
 * Created by lzh on 16-6-10.
 */
public class PanelImpl implements Panel {
    @Override
    public String windowsPanel() {
        System.out.println("create windowsPanel");
        return "windowsPanel";
    }

    @Override
    public String linuxPanel() {
        System.out.println("create linuxPanel");
        return "linuxPanel";
    }
}
