package edu.hust.chapter2;

/**
 * Created by liangjian on 2017/4/9.
 */
public class NutritionFactsTest {

	public static void main(String[] args) {
		NutritionFacts obj = new NutritionFacts.Builder(280, 10).calories(10).carbohydrate(20).fat(30).sodium(40).build();
	}
}
