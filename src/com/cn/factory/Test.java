package com.cn.factory;
/**
 * 
 * @author tianchengju
 *�ͻ��˽�ɫ��Դ����
 */
public class Test {
	public static void main(String[] args) {
		IWorkFactory aWorkFactory = new AWorkFactory();
		IWork aWork = aWorkFactory.createWork();
		aWork.doWork();
		
		 IWorkFactory bWorkFactory = new BWorkFactory();  
	     IWork bWork = bWorkFactory.createWork();  
	     bWork.doWork(); 
	}
}
