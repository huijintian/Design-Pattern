package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *�����ȼ���Ħ��
 */
public class Mocha extends Decorator{
	private String description = "����Ħ��";
	private Beverage beverage = null;
	public Mocha( Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + "\n" + description;
	}
	public double getPrice(){
		return beverage.getPrice() +30;
	}
}
