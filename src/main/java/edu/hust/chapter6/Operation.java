package edu.hust.chapter6;


/**
 * 特定于常量的方法
 *
 * Created by liangjian on 2017/4/27.
 */
public enum Operation {
	PLUS {double apply(double x, double y){return x + y;}},
	MINUS {double apply(double x, double y){return x - y;}},
	TIMES {double apply(double x, double y){return x * y;}},
	DIVIDE {double apply(double x, double y){return x / y;}};

	 abstract double apply(double x, double y);
}
