package edu.hust.chapter2;

/**
 * 如果一个类有多个成员变量，其中部分是必选，部分是可选，那么这个类的构造方式有如下三种：
 *
 * 构造器模式：
 * 		优点：不存在一致性等安全问题
 * 		缺点：只有一个可变参数，需要的构造函数较多
 * JavaBeans模式：
 * 		优点：不需要大量的构造函数
 * 		缺点：	存在一致性安全问题；类是可变的
 *
 * Builder模式：综合上述的优点，避免了其缺点。
 * 		Builder模式可以对所有参数进行独立校验，对不合法参数直接抛出异常IllegalStateException
 *
 * 	简而言之：如果类的构造器或者静态工厂中具有多个参数吗，设计这种类时，Builder模式就是种不错的选择，特别是当大多数参数都是可以选择的时候。
 *
 * Created by liangjian on 2017/4/9.
 */
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
		// required parameters
		private final int servingSize;
		private final int servings;

		// optional parameters
		private int calories =0;
		private int fat =0;
		private int carbohydrate =0;
		private int sodium =0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}
