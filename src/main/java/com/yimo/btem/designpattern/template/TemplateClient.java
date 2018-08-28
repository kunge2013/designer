package com.yimo.btem.designpattern.template;

/**
 * 模板方法客户端
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate;

        abstractTemplate = new ConcreteClassA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteClassB();
        abstractTemplate.templateMethod();

    }
}

//Output：
//具体类A的方法1实现
//具体类A的方法2实现
//模板方法结束
//
//具体类B的方法1实现
//具体类B的方法2实现
//模板方法结束
