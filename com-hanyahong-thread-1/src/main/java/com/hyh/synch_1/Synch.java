package com.hyh.synch_1;

/**
 * Created by hyh on 17-1-1.
 * 同步测试类
 */
public class Synch {
    public static void main(String[] args) {
        Message message = new Message();
        From from = new From(message, "我的消息:----1");
        From from2 = new From(message, "我的消息:----2");
        From from3 = new From(message, "我的消息:----3");

        try {
            from.thread.join();
            from2.thread.join();
            from3.thread.join();
        } catch (InterruptedException i) {
            System.out.println("异常");
        }
    }
}
