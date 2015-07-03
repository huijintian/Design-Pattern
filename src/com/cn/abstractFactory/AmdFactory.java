package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *��������AMD��ϵ�в�Ʒ 
 */
public class AmdFactory implements AbstractFactory{
	@Override
	public Cpu createCpu() {
		return new AmdCpu(8888);
	}
	@Override
	public MainBoard createMainBoard() {
		return new AmdMainBoard(8888);
	}
}
