package CglibDynamic;

//真实角色，被代理对象，租客
public class Tenant implements IRent {
    public void findHouse() {
        System.out.println("我是租客，我要租房子");
    }
}
