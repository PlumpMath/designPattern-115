package decorate.test;

import decorate.ChangeOne;
import decorate.ChangeTwo;
import decorate.Decorate;
import decorate.DecorateObject;

/**
 * Created by lzh on 3/29/16.
 */
public class Test {
    public static void main(String[] args) {
        Decorate decorate = new DecorateObject();
        Decorate changeOne = new ChangeOne(decorate);
        Decorate changeTwo = new ChangeTwo(decorate);
        changeOne.act();
        changeTwo.act();
    }
}
