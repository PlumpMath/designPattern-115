

/**
 * Created by lzh on 3/28/16.
 */
public class Test {
    public static void main(String[] args) {
        CarFactory factory = new CarFactoryImpl();
        //利用工厂创建Ferrari类
        Car ferrari = factory.getCar(Ferrari.class);
        System.out.println(ferrari.name()+"\t"+ferrari.color()+"\t"+ferrari.pay());
        //利用工厂创建RollsRoyce类
        Car rollsRoyce = factory.getCar(RollsRoyce.class);
        System.out.println(rollsRoyce.name()+"\t"+rollsRoyce.color()+"\t"+rollsRoyce.pay());
    }
}
