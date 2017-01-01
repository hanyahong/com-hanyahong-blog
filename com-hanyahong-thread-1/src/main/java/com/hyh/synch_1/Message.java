package com.hyh.synch_1;

/**
 * Created by hyh on 17-1-1.
 * 测试消息类
 */
public class Message {

    //发送消息  1.加入synchronized表示同步,不加入表示不同步,可以自己切换体验
    //public  void sendMeg(String meg) {
    public synchronized void sendMeg(String meg) {
        System.out.print("接受消息:" + meg);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("异常");
        }
        System.out.println("-----发送成功");
    }

    //
}

