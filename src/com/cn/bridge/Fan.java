package com.cn.bridge;

public class Fan implements IElectricalEquipment{
	@Override
	public void powerOff() {
		System.out.println("�رյ���");
	}
	@Override
	public void powerOn() {
		System.out.println("�򿪵���");
	}
}
