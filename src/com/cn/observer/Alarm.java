package com.cn.observer;
/**
 * ֻ�ǹ۲���
 * @author tianchengju
 *
 */
public class Alarm implements Observer{
	private String observerState;//����۲��ߵ�״̬

	@Override
	public void update(String state) {
		Boolean flag = Boolean.parseBoolean(state);
		if(flag){
			System.out.println("���������ˣ�ˮ�³���100�ˡ�");
		}
	} 
}
