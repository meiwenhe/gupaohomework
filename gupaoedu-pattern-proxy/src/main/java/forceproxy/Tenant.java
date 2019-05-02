package forceproxy;


//真实角色，被代理对象，租客
public class Tenant implements IRent{
    private IRent intermediary = null;
    public void findHouse() {
        if(intermediary == null){
          System.out.println("请通过我的代理找我，别来烦我");
        }else{
            System.out.println("我是租客，我要租房子");
        }

    }

    public forceproxy.IRent getProxyInstance(){
        this.intermediary = new Intermediary(this);
        return this.intermediary;
    }
}
