package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *����װ���࣬�����ȼ���ţ��
 */
public class Milk extends Decorator{
	private String description = "����ţ��";
	private Beverage beverage = null;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription() + "\n" + description;
	}
	public double getPrice(){
		return beverage.getPrice() + 20; //20��ʾţ�̵ļ۸�
	}
}
