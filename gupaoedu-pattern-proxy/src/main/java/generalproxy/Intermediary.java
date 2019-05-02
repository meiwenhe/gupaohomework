package generalproxy;

//代理类，中介机构
public class Intermediary implements forceproxy.IRent {
    private IRent rent = null;
    public Intermediary(){
        this.rent = new Tenant();
    }
    private void before(){//增强事件
        System.out.println("在帮租客找房子之前，需要先有房源");
    }
    public void findHouse() {
        before();
        this.rent.findHouse();
        after();
    }
    private void after(){//增强事件
        System.out.println("在帮租客找到房子之后，需要收取中介费");
    }

}
