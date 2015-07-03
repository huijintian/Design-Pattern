package com.cn.adapter;
/**
 * 
 * @author tianchengju
 *对象适配器模式
 */
public class Adapter2 implements Target{
	private Adaptee adaptee;
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	/** 
     * 待适配的类有次方法，适配器直接使用即可 
     */ 
	@Override
	public void getReceptacle1() {
		this.adaptee.getReceptacle1();
	}
	  /** 
     * 代适配的类无此方法，适配器补充 
     */ 
	@Override
	public void getReceptacle2() {
		System.out.println("扩展插口，此为三孔插口");
	}
}
