package com.adu.structural.facade;

/**
 * @author adu
 * @data 2019/5/22
 */
public class FacadeImpl implements Facade{
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public FacadeImpl(final SystemA systemA, final SystemB systemB, final SystemC systemC) {
        this.systemA = systemA;
        this.systemB = systemB;
        this.systemC = systemC;
    }

    @Override
    public void wrapOption() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
