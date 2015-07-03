package com.cn.bridge;

public class BridgeModeDemo {
	public static void main(String[] args) {
		Switch fancySwitch = new FancySwitch();
		Switch normalSwitch = new NormalSwitch();
		IElectricalEquipment fan = new Fan();
		IElectricalEquipment light = new Light();
		normalSwitch.setiEquip(light);
		fancySwitch.setiEquip(fan);
		fancySwitch.getiEquip().powerOn();
		normalSwitch.getiEquip().powerOn();
	}
}
