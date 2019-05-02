package dbroute.proxy;

import dbroute.Order;
import dbroute.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DbRouteStaticProxyTest {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        order.setId("order1");
        order.setOrderInfo("这是一个食品订单");
        order.setCreateTime(System.currentTimeMillis());
        OrderService orderService = new OrderService();
        DbRouteStaticProxy dbRouteStaticProxy = new DbRouteStaticProxy(orderService);
        dbRouteStaticProxy.createOrder(order);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");

        order.setCreateTime(sdf.parse("2017-12-12 12:12:12").getTime());

        dbRouteStaticProxy.createOrder(order);

    }
}
