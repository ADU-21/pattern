package com.adu.behavioral.chain.of.responsibility;

/**
 * @author LukeDu
 * @date 2019/6/3
 */
public class Filter {
    public static void doFilter(Request request, Response response, FilterChain chain) {
        chain.doFilter(request, response);
    }
}
