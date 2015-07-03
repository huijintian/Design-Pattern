package com.cn.bridge;

public class FancySwitch extends Switch{
	@Override
	public void On() {
		System.out.println("打开开关");
	}
	@Override
	public void Off() {
		System.out.println("关闭开关");
	}
}
