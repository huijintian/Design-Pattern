package com.cn.abstractFactory;

public class AmdMainBoard implements MainBoard{
	private int cpuHoles;//��ʾ�����ϵ�CPU��ۿ�������Ӧ�����
	public AmdMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCpu() {
		System.out.println("AMD�����ϵ�CPU��ۿ�����"+cpuHoles);
	}
}
