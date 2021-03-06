package com.cn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author tianchengju
 *被观察者角色 
 */
public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	/**
	 *  注册被观察者模式
	 * @param observer
	 */
	public void registerObserver(Observer observer){
		list.add(observer);
		System.out.println("注册了一个观察者角色");
	}
	/**
	 * 删除观察者对象 
	 * @param observer
	 */
	public void removeObserver(Observer observer){
		list.remove(observer);
	}
	/**
	 * 通知所有注册的观察者对象，我的状态改变咯 
	 * @param newState
	 */
	public void notifyAllObservers(String newState){
		for(Observer observer : list){
			observer.update(newState);
		}
	}
}
