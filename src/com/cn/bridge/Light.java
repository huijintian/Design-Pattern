package com.cn.bridge;

public class Light implements IElectricalEquipment{
	@Override
	public void powerOn() {
		System.out.println("打开电灯");
	}
	@Override
	public void powerOff() {
		System.out.println("关闭电灯");
	}
}
