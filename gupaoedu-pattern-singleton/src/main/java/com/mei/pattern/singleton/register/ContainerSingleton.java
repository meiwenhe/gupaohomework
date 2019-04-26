package com.mei.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
   private static Map<String,Object> container = new ConcurrentHashMap<String, Object>();
    public static Object getInstance(Class clazz){
        synchronized (container){
            if(container.containsKey(clazz.getName())){
                return container.get(clazz.getName());
            }else{
                Object o = null;
                try {
                    o = clazz.newInstance();
                    container.put(clazz.getName(),0);
                } catch (InstantiationException e) {
                    e.printStackTrace();

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return o;
            }
        }

    }
}
