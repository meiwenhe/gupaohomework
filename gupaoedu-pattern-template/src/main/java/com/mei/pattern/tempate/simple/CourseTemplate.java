package com.mei.pattern.tempate.simple;

public abstract class CourseTemplate {
    public void createCourse(){
        //在这个方法中定义算法，即方法执行的步骤

        //1.发布预习资料
        postPreResource();
        //2.制作上课时需要的ppt
        createPPT();
        //3.讲课
        teach();//抽象方法，即钩子方法，留给子类实现
        //4.检查课后作业
        if(hasHomework()){
            checkHomework();
        }

    }



    public boolean hasHomework(){//钩子函数，子类重写方法，不同的返回值能够修改模板的流程
        return  true;
    }
    private final void postPreResource(){ //final 规定第一步必须时发布预习资料，且只能这样实现
        System.out.println("第一步：发布预习资料");
    }
    private void createPPT(){
        System.out.println("第二步：制作PPT");
    }
    abstract void teach();
    private void checkHomework(){
        System.out.println("第四步：检查作业");
    }
}
