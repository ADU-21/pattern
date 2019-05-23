package com.adu.structural.proxy;

/**
 * @author adu
 * @data 2019/5/23
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("");
        image.display();
        image.display();
        image.display();
        image.display();
    }
}
