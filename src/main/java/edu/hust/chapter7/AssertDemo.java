package edu.hust.chapter7;

/**
 * jvm断言默认是关闭的
 * 断言可以局部开启的，如：父类禁止断言，而子类开启断言，所以一般说“断言不具有继承性”。
 * 断言只适用复杂的调式过程。
 * 断言一般用于程序执行结构的判断，千万不要让断言处理业务流程。
 *
 * Assert本意是为测试调试程序使用的，调试结束就去掉。
 *
 * 个人觉得业务中避免使用assert：所有的IDE默认关闭断言；调试使用junit，可以有assert
 *
 * Created by liangjian on 2017/4/27.
 */
public class AssertDemo {
	public static void main(String[] args) {
		boolean isOpen = false;

		// 如果开启了断言，会将isOpen的值改为true
		assert isOpen = true;

		// 打印是否开启了断言，如果为false，则没有启用断言
		System.out.println(isOpen);
	}
}
