package CglibDynamic;

public class CglibProxyTest {
    public static void main(String[] args){
        Tenant tenant = new Tenant();
        CglibProxy cglibProxy = new CglibProxy();
        Tenant tenantProxy =  (Tenant) cglibProxy.getInstance(tenant.getClass());
        tenantProxy.findHouse();
    }

}
