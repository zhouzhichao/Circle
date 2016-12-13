package com.example.zs.circle;

/**
 * Created by Chou on 2016/12/9.
 */
//DCL模式
public class Singleton {
    private volatile static Singleton instance=null;
    private Singleton() {}
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
