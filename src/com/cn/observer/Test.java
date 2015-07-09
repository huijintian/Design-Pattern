package com.cn.observer;
/**
 * ²âÊÔ
 * @author tianchengju
 *
 */
public class Test {
	public static void main(String[] args) {
		Heater heater = new Heater();
		Display display = new Display();
		Alarm alarm = new Alarm();
		heater.registerObserver(display);
		display.registerObserver(alarm);
		heater.boilWater();
	}
}
