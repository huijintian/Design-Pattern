package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *具体组件AmdCpu
 */
public class AmdCpu implements Cpu{
	private int pins;
	public AmdCpu(int pins){
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("AMD CPU的脚针数目："+pins);
	}
}
