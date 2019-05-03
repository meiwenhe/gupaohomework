package com.mei.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    private Map<String,IEmployee> registry = new HashMap<String, IEmployee>();
    public  Leader(){
        registry.put("加密",new EmployeeA());
        registry.put("架构",new EmployeeB());
    }
    public void doing(String commond){
        if(registry.get(commond)!=null){
            registry.get(commond).doing(commond);
        }else{
            System.out.println("占时没有从事相关工作的员工，请招人");
        }
    }
}
