package com.cn.observer;
/**
 * 观察者接口
 * @author tianchengju
 *
 */
public interface Observer {
	/**
	 * 更新接口
	 * @param state
	 */
	public void update(String state);
}
