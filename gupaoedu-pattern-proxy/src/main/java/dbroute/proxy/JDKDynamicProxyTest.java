package dbroute.proxy;

import dbroute.IOrderService;
import dbroute.Order;
import dbroute.OrderService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JDKDynamicProxyTest {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        order.setId("order1");
        order.setOrderInfo("这是一个食品订单");
        order.setCreateTime(System.currentTimeMillis());
        OrderService orderService = new OrderService();
        InvocationHandler orderServiceInvocationHandler = new JDKDynamicProxy<OrderService>(orderService);
        IOrderService dbRouteDynamic = (IOrderService)Proxy.newProxyInstance(orderService.getClass().getClassLoader(),orderService.getClass().getInterfaces(),orderServiceInvocationHandler);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
        dbRouteDynamic.createOrder(order);
        order.setCreateTime(sdf.parse("2017-12-12 12:12:12").getTime());
        dbRouteDynamic.createOrder(order);
    }
}
