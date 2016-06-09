
package simpleFactory;

/**
 * Created by lzh on 3/28/16.
 */
public class CarFactoryImpl implements CarFactory{
    private Car car;

    /**
     *
     * @param clasz 传入要利用工厂进行实现的类
     * @return 返回构造器实例化后的方法
     */
    public Car getCar(Class<? extends Car> clasz){
        try {
            car = (Car) Class.forName(clasz.getName()).newInstance();
            //newInstance()是弱类型，只能调用无参构造器
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
