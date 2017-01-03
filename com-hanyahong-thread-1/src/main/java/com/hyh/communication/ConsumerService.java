package com.hyh.communication;

/**
 * Created by hyh on 17-1-3.
 * 消费者
 * @author hyh
 */
public class ConsumerService implements Runnable {
    private ProductModel productModel;

    public ConsumerService(ProductModel productModel) {
        this.productModel = productModel;
        new Thread(this, "消费者").start();
    }

    public void run() {
        try {
            while (true) {
                productModel.getA();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {

        }
    }
}
