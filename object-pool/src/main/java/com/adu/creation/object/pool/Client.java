package com.adu.creation.object.pool;

/**
 * @author adu
 * @data 2019/5/14
 */
public class Client {

    public static void main(String[] args) {
        Pool pool = new Pool();
        System.out.println((pool.toString()));
        Product oliphaunt1 = pool.checkout();
        System.out.println(String.format("Checked out %s", oliphaunt1));
        System.out.println((pool.toString()));
        Product oliphaunt2 = pool.checkout();
        System.out.println(String.format("Checked out %s", oliphaunt2));
        Product oliphaunt3 = pool.checkout();
        System.out.println(String.format("Checked out %s", oliphaunt3));
        System.out.println((pool.toString()));
        System.out.println(String.format("Checking in %s", oliphaunt1));
        pool.checkIn(oliphaunt1);
        System.out.println(String.format("Checking in %s", oliphaunt2));
        pool.checkIn(oliphaunt2);
        System.out.println((pool.toString()));
        Product oliphaunt4 = pool.checkout();
        System.out.println(String.format("Checked out %s", oliphaunt4));
        Product oliphaunt5 = pool.checkout();
        System.out.println(String.format("Checked out %s", oliphaunt5));
        System.out.println((pool.toString()));
    }
}
