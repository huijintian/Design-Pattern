package com.cn.adapter;
/**
 * 
 * @author tianchengju
 *≤‚ ‘¿‡
 */
public class Computer {
	public static void main(String[] args) {
		Target target = new Adapter();
		
		Adaptee adaptee = new Adaptee();
		Target target2 = new Adapter2(adaptee);
		
		target.getReceptacle1();
		target.getReceptacle2();
		System.out.println("-----------------");
		target2.getReceptacle1();
		target2.getReceptacle2();
	}
}
