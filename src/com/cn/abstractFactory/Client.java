package com.cn.abstractFactory;

public class Client {
	public static void main(String[] args) {
		ComputerEngineer cEngineer = new ComputerEngineer();
		AbstractFactory intelFactory = new IntelFactory();//客户选定某类具体工厂,工厂负责成产匹配的组件
		cEngineer.makeComputer(intelFactory);//工程师开始组装 
	}
}
