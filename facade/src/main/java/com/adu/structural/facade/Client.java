package com.adu.structural.facade;

/**
 * @author adu
 * @data 2019/5/22
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new FacadeImpl(new SystemA(), new SystemB(), new SystemC());
        facade.wrapOption();
    }
}
