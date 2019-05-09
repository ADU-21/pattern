package adu.pattern.creation.builder;

import java.io.Serializable;

/**
 * @author adu
 * @data 2019/4/21
 */
public class ProductA implements Serializable {
    private String elementA;
    private String elementB;
    private String elementC;

    public String getElementA() {
        return elementA;
    }

    public void setElementA(String elementA) {
        this.elementA = elementA;
    }

    public String getElementB() {
        return elementB;
    }

    public void setElementB(String elementB) {
        this.elementB = elementB;
    }

    public String getElementC() {
        return elementC;
    }

    public void setElementC(String elementC) {
        this.elementC = elementC;
    }

    @Override
    public String toString() {
        return "ProductA{" +
            "elementA='" + elementA + '\'' +
            ", elementB='" + elementB + '\'' +
            ", elementC='" + elementC + '\'' +
            '}';
    }
}
