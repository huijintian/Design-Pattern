package com.cn.abstractFactory;

public class ComputerEngineer {
	private Cpu cpu =null;
	private MainBoard mainBoard = null;
	
	public void makeComputer(AbstractFactory af){
		 //1.׼��װ����Ӳ��  
        this.prepareHardWares(af);  
        //2.��װ����  
        //3.���Ի���  
        //4.�����ͻ�  
	}
	
	public void prepareHardWares(AbstractFactory af){
		this.cpu = af.createCpu(); //׼��CPU�����ǲ�������ʲôCPU  
		this.mainBoard = af.createMainBoard(); //׼�����壬Ҳ��������ʲô����  
		  //�鿴�ۿ��Ƿ�ͽ�����Ŀƥ��  
		this.cpu.calculate();
		this.mainBoard.installCpu();
	}
}
