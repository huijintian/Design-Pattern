package com.cn.bridge;

public class Light implements IElectricalEquipment{
	@Override
	public void powerOn() {
		System.out.println("�򿪵��");
	}
	@Override
	public void powerOff() {
		System.out.println("�رյ��");
	}
}
