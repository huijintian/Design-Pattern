package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *�������IntelCpu
 */
public class IntelCpu implements Cpu{
	private int pins; //��ʾCPU�Ľ�����
	public IntelCpu(int pins){
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("IntelCPU �Ľ�����Ŀ��"+pins);
	}
}
