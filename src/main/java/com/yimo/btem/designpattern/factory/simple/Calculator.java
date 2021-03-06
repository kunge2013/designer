package com.yimo.btem.designpattern.factory.simple;

/**
 * 使用工厂方法生成实例完成运算操作
 */
public class Calculator {
    public static void main(String[] args) {
        Operation operation;
        char operator = '+';
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 1.2;
        operation.numberB = 2.3;
        System.out.println(operation.result());
    }
}

//Output:
//3.5