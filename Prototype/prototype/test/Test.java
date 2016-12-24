
package prototype.test;

import prototype.PrototypeSub;

/**
 * Created by lzh on 3/29/16.
 */
public class Test {
    public static void main(String[] args) {
        PrototypeSub prototypeSub = new PrototypeSub();
        prototypeSub.setName("令照辉");
        PrototypeSub prototypeSubClone;
        try {
            prototypeSubClone = (PrototypeSub) prototypeSub.clone();
            prototypeSubClone.say();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
