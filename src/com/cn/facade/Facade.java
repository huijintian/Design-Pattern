package com.cn.facade;
/**
 * 
 * @author tianchengju
 *门面，相当于医院的接待处
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
	//接待处挂号
	public void register(){
		register.register();
	}
	//接待处带着病人去治疗，这个地方有点不妥，毕竟病人需要和医生直接打交道，理解就好  
    public void treat(){  
        treatMent.treat();  
    }  
    //接待处缴费  
    public void pay(){  
        payment.pay();  
    }  
    //接待处取药  
    public void getDrug(){  
        drugstore.getDrug();  
    }  
}
