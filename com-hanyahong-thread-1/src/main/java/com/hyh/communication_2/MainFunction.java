package com.hyh.communication_2;

/**
 * Created by hyh on 17-1-3.
 * 主方法
 */
public class MainFunction {
    public static void main(String[] args) {
        //实例一个产品
        ProductModel productModel = new ProductModel();
        //调用生产者服务
        ProducerService producer = new ProducerService(productModel);
        //调用消费者服务
        ConsumerService consumer = new ConsumerService(productModel);
        System.out.println("生产者-消费者-线程通讯");
    }
}
