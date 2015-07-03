package com.cn.singleton;
/**
 * 
 * @author tianchengju
 *˫�ؼ���������ʵ���̰߳�ȫ������ʹ���ܲ��ܴܺ��Ӱ��
 */
public class Singleton {
	//��volatile���εı�����ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д����ֱ�Ӳ���
	//�����ڴ棬�Ӷ�ȷ������߳�����ȷ�Ĵ���ñ���
	private volatile static Singleton instance = null;
	//˽�й��췽��
	private Singleton(){}
	//������̬������ȡʵ��
	public static Singleton getSingletonInstance(){
		if(instance == null){//�ȼ��ʵ���Ƿ���ڣ������ڣ��ٽ���ͬ��
			synchronized (Singleton.class) {//ͬ���飬�̰߳�ȫ��ʵ��
				if(instance == null){//�ٴμ��ʵ���Ƿ���ڣ���������ڲ������Ĵ���ʵ��
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
