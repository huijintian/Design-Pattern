package com.cn.decorator;
/**
 * @author tianchengju
 *װ����
 */
public class Decorator implements Beverage{
	private String description = "��ֻ��װ��������֪�����������";
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public double getPrice() {
		return 0;   //�۸�������������
	}
}
