package com.cn.abstractFactory;
/**
 * 
 * @author tianchengju
 *抽象工厂，不负责制造具体的产品
 */
public interface AbstractFactory {
	/**
	 * 创建CPU对象
	 * @return Cpu对象
	 */
	public Cpu createCpu();
	  /** 
     * 创建MainBoard对象 
     * @return MainBoard对象 
     */ 
	public MainBoard createMainBoard();
}
