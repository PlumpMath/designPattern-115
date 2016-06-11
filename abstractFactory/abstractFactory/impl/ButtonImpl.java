package abstractFactory.impl;

import abstractFactory.Button;

/**
 * Created by lzh on 16-6-10.
 */
public class ButtonImpl implements Button {
    @Override
    public String windowsButton() {
        System.out.println("create windowsButton");
        return "windowsButton";
    }

    @Override
    public String linuxButton() {
        System.out.println("create linuxButton");
        return "linuxButton";
    }
}
