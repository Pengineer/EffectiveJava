package edu.hust.chapter6;

/**
 * enum类中国定义的方法必须在实例之后，且最后一个实例使用分号。
 *
 * Created by liangjian on 2017/4/25.
 */
public enum Direction {
	EAST(""),
	SOURTH(""),
	WEST(""),
	NORTH("");

	private String description;
	private Direction(String description) {   // 要不要private都一样，enum类的实例是固定的，用户不能创建新实例
		this.description= description;
	}

	public String getDescription() {
		return this.description;
	}
}
