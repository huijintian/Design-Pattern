package com.cn.abstractFactory;

public class IntelMainBoard implements MainBoard{
	private int cpuHoles;//��ʾ�����ϵ�CPU��ۿ�������Ӧ�����
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCpu() {
		System.out.println("Intel�����ϵ�CPU��ۿ�����"+cpuHoles);
	}
}
