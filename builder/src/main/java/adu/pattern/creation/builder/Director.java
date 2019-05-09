package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructA(Builder builder) {
        builder.reset();
        builder.elementA("elementA");
        builder.elementB("elementB");
    }

    public void constructB(Builder builder) {
        builder.reset();
        builder.elementB("elementB");
        builder.elementC("elementC");
    }
}
