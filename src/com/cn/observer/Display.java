package com.cn.observer;
/**
 * ��ʾ�������ǹ۲������Ǳ��۲��� 
 * @author tianchengju
 *
 */
public class Display extends Subject implements Observer{
	private boolean isBoiled = false;//��ʾˮ�Ƿ��տ�
	private int displayTemperature;//������ʾ�����¶�
	
	
	public boolean isBoiled() {
		return isBoiled;
	}

	public void setBoiled(boolean isBoiled) {
		this.isBoiled = isBoiled;
	}


	@Override
	public void update(String state) {
		displayTemperature = Integer.parseInt(state);
		System.out.println("��ǰ��ʾ�����¶��ǣ�"+displayTemperature);
		this.displayTemperature(displayTemperature);
	}

	private void displayTemperature(int temperature) {
		if(temperature>100){
			this.setBoiled(true);
			this.notifyAllObservers(Boolean.toString(isBoiled));
		}
	}
	
}
