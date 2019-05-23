package com.adu.structural.privataclassdata;

/**
 * @author adu
 * @data 2019/5/23
 */
public class DataClass {
    private Long a;
    private Long b;

    public DataClass(Long a, Long b) {
        this.a = a;
        this.b = b;
    }

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }
}
