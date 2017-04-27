package edu.hust.chapter6;

/**
 * 关键字enum可以将一组具有名称的值（具名值）的有限集合创建为一种新的类型。
 *
 * Created by liangjian on 2017/4/20.
 */
public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Operation.PLUS.apply(1, 2));
	}

	public static void method1() {
		Color c1 = Color.BLUE;
		System.out.println(c1);    // BLUE， 创建Enum类时，自动创建toString方法
		System.out.println(c1.ordinal());

		Color c2 = Color.BLUE,
				c3 = Color.GREEN;    // 这种写法。。。。。

		switch(c1) {
			case RED :
				System.out.println("red");
				break;
			case GREEN :
				System.out.println("green");
				break;
			case BLUE:
				System.out.println("blue");
				break;
		}

		System.out.println(Direction.EAST);
	}

}
