package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *用来创建AMD下系列产品 
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
