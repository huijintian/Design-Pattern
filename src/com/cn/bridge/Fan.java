package com.cn.bridge;

public class Fan implements IElectricalEquipment{
	@Override
	public void powerOff() {
		System.out.println("关闭电扇");
	}
	@Override
	public void powerOn() {
		System.out.println("打开电扇");
	}
}
