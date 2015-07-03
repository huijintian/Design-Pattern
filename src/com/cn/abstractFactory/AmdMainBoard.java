package com.cn.abstractFactory;

public class AmdMainBoard implements MainBoard{
	private int cpuHoles;//表示主板上的CPU插槽孔数，对应针脚数
	public AmdMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCpu() {
		System.out.println("AMD主板上的CPU插槽孔数："+cpuHoles);
	}
}
