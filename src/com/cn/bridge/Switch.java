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
		//���ش�
	}
	public void Off(){
		//���عر�
	}
}
