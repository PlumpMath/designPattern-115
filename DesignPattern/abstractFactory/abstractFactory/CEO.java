

/**
 * Created by lzh on 3/28/16.
 */
public class CEO implements AbstractFactory {
    private Class<? extends Enterprise> clazz;
    public void setEnterprise(Class<? extends Enterprise> clazz) {
        this.clazz = clazz;
    }

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public String getCEO() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Enterprise ceo = (Enterprise) Class.forName(clazz.getName()).newInstance();
        return ceo.ceo();
    }

    public String getArchitect() {
        try {
            throw new Exception("nop");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
