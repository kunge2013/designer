package com.yimo.btem.designpattern.adapter;

/**
 * 适配器客户端
 */
public class AdapterClient {
    public static void main(String[] args) {
        Target target;
        target = new Adapter();
        target.request();
    }
}
