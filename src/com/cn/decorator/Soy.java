package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *�����ȼ��붹��
 */
public class Soy extends Decorator{
	private String description = "���˶���";
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
