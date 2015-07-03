package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 * 用来创建与Intel相关的所有产品
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
