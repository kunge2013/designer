package com.yimo.btem.designpattern.factory.simple;

/**
 * 减法类
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}