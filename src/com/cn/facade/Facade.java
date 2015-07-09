package com.cn.facade;
/**
 * 
 * @author tianchengju
 *���棬�൱��ҽԺ�ĽӴ���
 */
public class Facade {
	private Register register;
	private TreatMent treatMent;
	private Payment payment;
	private Drugstore drugstore;
	public Facade(){
		register = new Register();
		treatMent = new TreatMent();
		payment = new Payment();
		drugstore = new Drugstore();
	}
	//�Ӵ����Һ�
	public void register(){
		register.register();
	}
	//�Ӵ������Ų���ȥ���ƣ�����ط��е㲻�ף��Ͼ�������Ҫ��ҽ��ֱ�Ӵ򽻵������ͺ�  
    public void treat(){  
        treatMent.treat();  
    }  
    //�Ӵ����ɷ�  
    public void pay(){  
        payment.pay();  
    }  
    //�Ӵ���ȡҩ  
    public void getDrug(){  
        drugstore.getDrug();  
    }  
}
