package com.cn.singleton;
/**
 * 
 * @author tianchengju
 *双重检查加锁，即实现线程安全，又能使性能不受很大的影响
 */
public class Singleton {
	//被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作
	//共享内存，从而确保多个线程能正确的处理该变量
	private volatile static Singleton instance = null;
	//私有构造方法
	private Singleton(){}
	//公共静态方法获取实例
	public static Singleton getSingletonInstance(){
		if(instance == null){//先检查实例是否存在，不存在，再进行同步
			synchronized (Singleton.class) {//同步块，线程安全的实例
				if(instance == null){//再次检查实例是否存在，如果不存在才真正的创建实例
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
