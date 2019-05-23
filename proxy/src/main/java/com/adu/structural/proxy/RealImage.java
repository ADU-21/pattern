package com.adu.structural.proxy;

/**
 * @author adu
 * @data 2019/5/23
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display..." + fileName);
    }

    private void load(String fileName) {
        System.out.println("Loading..." + fileName);
    }
}
