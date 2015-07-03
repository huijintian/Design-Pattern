package com.cn.factory;
/**
 * 
 * @author tianchengju
 *客户端角色类源代码
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
