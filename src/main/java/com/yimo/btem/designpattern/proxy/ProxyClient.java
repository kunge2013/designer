package com.yimo.btem.designpattern.proxy;

/**
 * 代理客户端
 */
public class ProxyClient {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

//Output:
//真实对象的请求