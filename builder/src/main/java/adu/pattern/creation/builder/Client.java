package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.construct("default");
        System.out.println(product);
    }
}
