package com.hyh.thread;

/**
 * Created by hyh on 17-1-1.
 * 使用集成Runnable方式 三个线程的实现
 */
public class Demo4 implements Runnable {
    //全局变量
    String name;
    Thread thread;

    //构造器
    public Demo4(String th) {
        name = th;
        thread = new Thread(this, name);
        System.out.println("新线程" + thread);
        //开始线程
        thread.start();
    }

    //重写run方法
    public void run() {
        try {
            for (int a = 5; a > 0; a--) {
                System.out.println(name + ":" + a);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("异常");
        }
        System.out.println(name + "线程结束");
    }
}

/**
 * 测试类
 */
class MultThreadDemo {

    public static void main(String[] args) {
        //创建三个线程
        Demo4 thread_1 = new Demo4("线程一");
        Demo4 thread_2 = new Demo4("线程二");
        Demo4 thread_3 = new Demo4("线程三");
        //查看状态
        System.out.println("线程一状态:" + thread_1.thread.isAlive());
        System.out.println("线程二状态:" + thread_2.thread.isAlive());
        System.out.println("线程三状态:" + thread_3.thread.isAlive());

        try {
            System.out.println("等待其他线程结束");
            //使用join确保主线程最后运行
            thread_1.thread.join();
            thread_2.thread.join();
            thread_3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("线程异常");

        }
        //查看状态
        System.out.println("线程一:" + thread_1.thread.isAlive());
        System.out.println("线程二:" + thread_2.thread.isAlive());
        System.out.println("线程三:" + thread_3.thread.isAlive());
    }
}