package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public class Client {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        Filter.doFilter(new Request(new RamProvider()), new Response(), filterChain);
    }
}
