package com.cn.factory;
/**
 * 
 * @author tianchengju
 *���幤��B
 */
public class BWorkFactory implements IWorkFactory {
	@Override
	public IWork createWork() {
		return new BWork();
	}
}
