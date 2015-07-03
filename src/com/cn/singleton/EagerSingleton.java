package com.cn.singleton;
/**
 * 
 * @author tianchengju
 *����ģʽ
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	
	/**
	 * ˽��Ĭ�Ϲ��췽��
	 */
	private EagerSingleton(){}
	/**
	 * ��̬��������
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
}
