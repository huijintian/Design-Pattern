package com.cn.adapter;
/**
 * 
 * @author tianchengju
 *����������ģʽ
 */
public class Adapter2 implements Target{
	private Adaptee adaptee;
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	/** 
     * ����������дη�����������ֱ��ʹ�ü��� 
     */ 
	@Override
	public void getReceptacle1() {
		this.adaptee.getReceptacle1();
	}
	  /** 
     * ����������޴˷��������������� 
     */ 
	@Override
	public void getReceptacle2() {
		System.out.println("��չ��ڣ���Ϊ���ײ��");
	}
}
