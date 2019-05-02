package dbroute.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDKDynamicProxy<T> implements InvocationHandler{
    T target;
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    public JDKDynamicProxy(T target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object o = method.invoke(target,args);
        after();
        return o;
    }
    private void before(Object order) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*在动态代理中由于target类型不确定，因此获取不到订单的时间，如果将T设置成订单，
        则违背动态代理能代理任何对象的初衷，因此在动态代理中实现通用性的功能比较好，比如日志，流的关闭等*/


        //

        //或者约定优于配置
        Long time = (Long) order.getClass().getMethod("getCreateTime").invoke(order);
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        System.out.println("按照订单的时间对数据库进行分库分表操作，当前订单已经被分配到【"+2019+"】数据库进行处理");

    }

    private void after(){
        System.out.println("数据库被恢复到默认的数据库");
    }
}
