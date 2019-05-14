package com.adu.creation.object.pool;

/**
 * @author adu
 * @data 2019/5/14
 */
public class Pool extends ObjectPool<Product> {
    @Override
    public Product create() {
        return new Product();
    }
}
