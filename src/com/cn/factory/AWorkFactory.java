package com.cn.factory;
/**
 * 
 * @author tianchengju
 *具体工厂A
 */
public class AWorkFactory implements IWorkFactory {
	@Override
	public IWork createWork() {
		return new AWork();
	}
}
