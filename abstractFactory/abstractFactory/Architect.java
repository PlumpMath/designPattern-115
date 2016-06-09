package abstractFactory;

import abstractFactory.AbstractFactory;

/**
 * Created by lzh on 3/28/16.
 */
public class Architect implements AbstractFactory {
    private Class<? extends Enterprise> clazz;
    public void setEnterprise(Class<? extends Enterprise> clazz) {
        this.clazz = clazz;
    }
    public String getCEO() {
        try {
            throw new Exception("nop");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public String getArchitect() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Enterprise architect = (Enterprise) Class.forName(clazz.getName()).newInstance();
        return architect.architect();
    }
}
