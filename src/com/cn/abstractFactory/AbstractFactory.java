package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *���󹤳����������������Ĳ�Ʒ
 */
public interface AbstractFactory {
	/**
	 * ����CPU����
	 * @return Cpu����
	 */
	public Cpu createCpu();
	  /** 
     * ����MainBoard���� 
     * @return MainBoard���� 
     */ 
	public MainBoard createMainBoard();
}
