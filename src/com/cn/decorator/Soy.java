package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *给咖啡加入豆浆
 */
public class Soy extends Decorator{
	private String description = "加了豆浆";
	private Beverage beverage = null;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + "\n" + description;
	}
	public double getPrice(){
		return beverage.getPrice() + 30;
	}
}
