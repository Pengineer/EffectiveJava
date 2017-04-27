package edu.hust.chapter6;

/**
 * 枚举类型的实例是常量，故大写
 *
 * enum就是类，只不过使用enum关键字时，编译器会产生一些特定的行为，比如生成toString方法、ordinal方法、values方法。唯一不同的是enum等同于final类，因此不能被继承。
 *
 * 枚举类有个特别使用的特性，就是可以在switch语句中使用
 *
 * Created by liangjian on 2017/4/21.
 */
public enum Color {
	RED, GREEN, BLUE
}
