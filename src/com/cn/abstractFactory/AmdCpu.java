package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *�������AmdCpu
 */
public class AmdCpu implements Cpu{
	private int pins;
	public AmdCpu(int pins){
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("AMD CPU�Ľ�����Ŀ��"+pins);
	}
}
