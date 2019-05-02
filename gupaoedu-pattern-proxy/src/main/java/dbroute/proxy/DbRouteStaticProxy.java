package dbroute.proxy;

import dbroute.IOrderService;
import dbroute.Order;

import java.util.Calendar;
import java.util.Date;

public class DbRouteStaticProxy implements IOrderService{
    IOrderService orderService;
    private void before(Order order){//根据订单的事件对订单进行按创建事件的年份分库分表
        Long time = order.getCreateTime();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(time));
        System.out.println("按照订单的时间对数据库进行分库分表操作，当前订单已经被分配到【"+c.get(Calendar.YEAR)+"】数据库进行处理");

    }

    private void after(){
        System.out.println("数据库被恢复到默认的数据库");
    }

    public DbRouteStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }
    public int createOrder(Order order) {
        before(order);
        int result = this.orderService.createOrder(order);
        after();
        return result;
    }
}
