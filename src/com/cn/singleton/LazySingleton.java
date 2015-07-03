package com.cn.singleton;
/**
 * 
 * @author tianchengju
 *����ģʽ����Ҫ��ʱ��Ŵ���
 */
public class LazySingleton {
		//��̬�����������洴��ʵ��
	private static LazySingleton instance = null;
	//˽�й��췽������������ɴ���ʵ��
	private LazySingleton(){}
	//��̬������������ȡ�ø�ʵ��
	public static synchronized LazySingleton getLazySingletonInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
