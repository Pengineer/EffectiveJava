package edu.hust.common;


import com.google.common.collect.Maps;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



/**
 * Created by liangjian on 2017/4/9.
 */
public class CommonTest {
	public static void main(String[] args) {
//		CommonTest test = new CommonTest();
//		test.method1(test);

//		System.out.println(Inner.k);

//		System.out.println(test == test.getInstance());  // true


//		Map<String, String> map = Maps.newHashMap();

//		OSExecute.command("javap Inner");
		System.out.printf("%s%n", "aaa");
		System.out.printf("%s%n", "aaa");
	}

	public void method1(Object obj) {
		System.out.println("method1");
	}

	public void method1(CommonTest obj) {
		System.out.println("method2");
	}

	 class Inner {
//		public static int k = 1;
//		static {
//			System.out.println("Inner class");
//		}
	}

	public CommonTest getInstance() {
		return this; // 返回当前实例对象
	}

	public void reflect(Class clazz) {
		clazz.getMethods();
	}
}
