package com.cn.abstractFactory;

public class Client {
	public static void main(String[] args) {
		ComputerEngineer cEngineer = new ComputerEngineer();
		AbstractFactory intelFactory = new IntelFactory();//�ͻ�ѡ��ĳ����幤��,��������ɲ�ƥ������
		cEngineer.makeComputer(intelFactory);//����ʦ��ʼ��װ 
	}
}
