package com.cn.decorator;
/**
 * 
 * @author tianchengju
 *���屻װ�εĶ�����2
 */
public class CoffeeBean2 implements Beverage{
	private String description = "�ڶ��ֿ��ȶ�";
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public double getPrice() {
		return 100;
	}
}
