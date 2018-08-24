package com.yimo.btem.designpattern.factory.abstraction;

import com.yimo.btem.designpattern.factory.simple.Operation;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws InstantiationException,
        IllegalAccessException {
    Operation operation = OperationFactory.createOperation("/");

    operation.numberA = 7;
    operation.numberB = 8;

    System.out.println(operation.result());
    }
}
