package com.cn.adapter;

public class Adapter extends Adaptee implements Target{
	@Override
	public void getReceptacle2() {
		System.out.println("扩展插口，此为三孔插口");
	}
}
