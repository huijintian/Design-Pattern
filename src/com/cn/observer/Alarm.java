package com.cn.observer;
/**
 * 只是观察者
 * @author tianchengju
 *
 */
public class Alarm implements Observer{
	private String observerState;//定义观察者的状态

	@Override
	public void update(String state) {
		Boolean flag = Boolean.parseBoolean(state);
		if(flag){
			System.out.println("报警器响了，水温超过100了。");
		}
	} 
}
