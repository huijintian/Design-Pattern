package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *���屻װ�εĶ�����1
 */
public class CoffeeBean1 implements Beverage{
	private String description = "ѡ�˵�һ�ֿ��ȶ�";
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public double getPrice() {
		return 50;
	}
}
