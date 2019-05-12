package adu.pattern.creation.factory.kit;

import java.util.function.Supplier;

/**
 * @author adu
 * @data 2019/5/12
 */
public interface Builder {
    void add(ProductType productType, Supplier<Product> supplier);
}
