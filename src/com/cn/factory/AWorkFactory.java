package com.cn.factory;
/**
 * 
 * @author tianchengju
 *���幤��A
 */
public class AWorkFactory implements IWorkFactory {
	@Override
	public IWork createWork() {
		return new AWork();
	}
}
