package JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IntermediaryInvocationHandle<T> implements InvocationHandler {
    T target;
    private void before(){//增强事件
        System.out.println("在帮租客找房子之前，需要先有房源");
    }
    public IntermediaryInvocationHandle(T target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o =  method.invoke(target, args);
        after();
        return o;
    }
    private void after(){//增强事件
        System.out.println("在帮租客找到房子之后，需要收取中介费");
    }
}
