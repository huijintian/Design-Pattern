package com.cn.observer;
/**
 * 显示器，既是观察者又是被观察者 
 * @author tianchengju
 *
 */
public class Display extends Subject implements Observer{
	private boolean isBoiled = false;//表示水是否烧开
	private int displayTemperature;//定义显示器的温度
	
	
	public boolean isBoiled() {
		return isBoiled;
	}

	public void setBoiled(boolean isBoiled) {
		this.isBoiled = isBoiled;
	}


	@Override
	public void update(String state) {
		displayTemperature = Integer.parseInt(state);
		System.out.println("当前显示器的温度是："+displayTemperature);
		this.displayTemperature(displayTemperature);
	}

	private void displayTemperature(int temperature) {
		if(temperature>100){
			this.setBoiled(true);
			this.notifyAllObservers(Boolean.toString(isBoiled));
		}
	}
	
}
