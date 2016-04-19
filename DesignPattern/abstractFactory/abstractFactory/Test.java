

/**
 * Created by lzh on 3/28/16.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory architect = new Architect();
        AbstractFactory ceo = new CEO();
        architect.setEnterprise(AlibabaImp.class);
        ceo.setEnterprise(TencentImp.class);
        try {
            System.out.println(architect.getArchitect());
            System.out.println(ceo.getCEO());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
