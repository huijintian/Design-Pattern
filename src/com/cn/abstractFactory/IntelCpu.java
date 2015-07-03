package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *具体组件IntelCpu
 */
public class IntelCpu implements Cpu{
	private int pins; //表示CPU的脚针数
	public IntelCpu(int pins){
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("IntelCPU 的脚针数目："+pins);
	}
}
