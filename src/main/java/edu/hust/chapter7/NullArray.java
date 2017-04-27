package edu.hust.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 如何正确返回空数组，避免返回null
 *
 * Created by liangjian on 2017/4/27.
 */
public class NullArray {

	private static final NullArray[] EMPTY_NULLARRAY_ARRAY = new NullArray[0];        // 可以作为常量存在于常量类中

	public NullArray[] getNullArray() {
		return EMPTY_NULLARRAY_ARRAY;
	}

	/**
	 * 同样，集合值的方法也可以做成在每当需要返回空集合时都返回同一个不可变的空集合。
	 * Collection.emptySet  Collenction.emptyList  Collection.emptyMap
	 */
	public List getList(List arg) {
		List business = new ArrayList();

		if (arg.size() == 0) {
			return Collections.emptyList();
		} else {
			return business;
		}
	}
}
