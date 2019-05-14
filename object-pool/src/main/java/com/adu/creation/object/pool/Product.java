package com.adu.creation.object.pool;

import java.util.UUID;

/**
 * @author adu
 * @data 2019/5/14
 */
public class Product {
    private String uuid = UUID.randomUUID().toString();

    @Override
    public String toString() {
        return "Product{" +
            "uuid='" + uuid + '\'' +
            '}';
    }
}
