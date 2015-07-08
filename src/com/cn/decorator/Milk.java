package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *具体装饰类，给咖啡加入牛奶
 */
public class Milk extends Decorator{
	private String description = "加了牛奶";
	private Beverage beverage = null;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + "\n" + description;
	}
	public double getPrice(){
		return beverage.getPrice() + 20; //20表示牛奶的价格
	}
}
