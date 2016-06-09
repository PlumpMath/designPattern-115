package abstractFactory;

/**
 * Created by lzh on 3/28/16.
 */
public interface AbstractFactory {
    void setEnterprise(Class<? extends Enterprise> clazz);
    String getCEO() throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    String getArchitect() throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
