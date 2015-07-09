package com.cn.observer;
/**
 * 热水器，一个具体的被观察者
 * @author tianchengju
 *
 */
public class Heater extends Subject{
	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void boilWater(){
		for(int i=95;i<105;i++){
			temperature = i;
			this.setTemperature(temperature);//设置新的温度
			this.notifyAllObservers(Integer.toString(temperature));//通知所有注册的观察者
		}
	}
}
