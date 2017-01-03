package com.hyh.communication_2;

/**
 * Created by hyh on 17-1-3.
 * 生产者
 */
public class ProducerService implements Runnable {

    private ProductModel productModel;

    //构造函数
    public ProducerService(ProductModel productModel) {
        this.productModel = productModel;
        new Thread(this, "生产者").start();
    }

    public void run() {
        int i = 0;
        try {

            while (true) {
                productModel.setA(i++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {

        }
    }
}
