package CglibDynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private void before(){//增强事件
        System.out.println("在帮租客找房子之前，需要先有房源");
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object ob = methodProxy.invokeSuper(o,objects);
        after();
        return ob;
    }
    private void after(){//增强事件
        System.out.println("在帮租客找到房子之后，需要收取中介费");
    }
    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
