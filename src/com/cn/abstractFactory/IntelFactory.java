package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 * ����������Intel��ص����в�Ʒ
 */
public class IntelFactory implements AbstractFactory{
	@Override
	public Cpu createCpu() {
		return new IntelCpu(555);
	}
	@Override
	public MainBoard createMainBoard() {
		return new IntelMainBoard(555);
	}
}
