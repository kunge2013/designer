package com.yimo.btem.designpattern.strategy;

/**
 * 客户端使用策略
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
//Output:
//策略A的具体算法实现
//策略B的具体算法实现
//策略C的具体算法实现