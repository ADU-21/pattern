package adu.pattern.creation.factory.kit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author adu
 * @data 2019/5/12
 */
public interface Factory {
    Product create(ProductType name);

    static Factory init(Consumer<Builder> consumer) {
        HashMap<ProductType, Supplier<Product>> map = new HashMap<>();
        consumer.accept(map::put);
        return type -> map.get(type).get();
    }
}
