package com.cn.decorator;

public class Test {
	public static void main(String[] args) {
		Beverage beverage = new CoffeeBean1();
		beverage = new Mocha(beverage);
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription()+"\n����Ħ����ţ�̵Ŀ��ȼ۸�" + "  " +beverage.getPrice());
	}
}
