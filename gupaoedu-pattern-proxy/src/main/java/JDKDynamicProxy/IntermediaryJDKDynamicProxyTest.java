package JDKDynamicProxy;

import java.lang.reflect.Proxy;

public class IntermediaryJDKDynamicProxyTest {
    public static void main(String[] args){
        Tenant tenant = new Tenant();
        IntermediaryInvocationHandle<Tenant> handle = new IntermediaryInvocationHandle<Tenant>(tenant);
        IRent proxy = (IRent) Proxy.newProxyInstance(Tenant.class.getClassLoader(),Tenant.class.getInterfaces(),handle);
        proxy.findHouse();
    }
}
