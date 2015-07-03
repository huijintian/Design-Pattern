package com.cn.bridge;

public class Switch {
	public IElectricalEquipment iEquip;
	public IElectricalEquipment getiEquip(){
		return iEquip;
	}
	public void setiEquip(IElectricalEquipment iEquip){
		this.iEquip = iEquip;
	}
	public void On(){
		//开关打开
	}
	public void Off(){
		//开关关闭
	}
}
