package com.cn.factory;
/**
 * 
 * @author tianchengju
 *具体工作类A
 */
public class AWork implements IWork{
	@Override
	public void doWork() {
		System.out.println("做A工作");
	}
}
