package com.cn.factory;
/**
 * 
 * @author tianchengju
 *具体工厂B
 */
public class BWorkFactory implements IWorkFactory {
	@Override
	public IWork createWork() {
		return new BWork();
	}
}
