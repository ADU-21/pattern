package com.adu.structural.adapter;

/**
 * @author adu
 * @data 2019/5/19
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        System.out.println(adapter.getString());
        System.out.println(adapter.getList());
        System.out.println(adapter.getLong());
    }
}
