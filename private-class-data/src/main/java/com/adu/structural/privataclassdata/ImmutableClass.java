package com.adu.structural.privataclassdata;

/**
 * @author adu
 * @data 2019/5/23
 */
public class ImmutableClass {
    private DataClass dataClass;

    public ImmutableClass(DataClass dataClass) {
        this.dataClass = dataClass;
    }

    public Long sum() {
        return dataClass.getA() + dataClass.getB();
    }
}
