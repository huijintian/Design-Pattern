package com.cn.adapter;
/**
 * 
 * @author tianchengju
 *类适配器模式
 */
public class Adapter extends Adaptee implements Target{
	@Override
	public void getReceptacle2() {
		System.out.println("扩展插口，此为三孔插口");
	}
}
