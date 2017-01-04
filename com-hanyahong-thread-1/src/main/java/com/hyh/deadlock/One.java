package com.hyh.deadlock;

/**
 * Created by hyh on 17-1-4.
 * One服务类
 *
 * @author hyh
 */
public class One {

    //方法一
    synchronized void one_func_1(Two two) {
        //获取线程名
        String name = Thread.currentThread().getName();
        System.out.println(name + "--进入One类--fun_1方法");

        //线程睡眠1秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("异常:InterruptedException");
        }

        //尝试连接Two类的fun_2方法
        System.out.println(name + "在尝试连接Two的fun_2方法");
        two.two_func_2();

    }

    //第二个方法
    public synchronized void One_func_2() {
        System.out.println("这个One类的fun_2方法");
    }

}
