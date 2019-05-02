package forceproxy;
//强制代理
public class ForceProxyTest {
    public static void main(String[] args){
        System.out.println("\n\n\n-----直接找代理对象---------");
        Tenant tenant = new Tenant();
        Intermediary intermediary = new Intermediary(tenant);
        intermediary.findHouse();
        System.out.println("\n\n\n-----通过被代理对象找代理对象---------");
        IRent intermediary1 =  tenant.getProxyInstance();
        intermediary1.findHouse();

    }
}
