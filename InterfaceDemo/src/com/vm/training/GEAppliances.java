package com.vm.training;


public class GEAppliances implements SwitchListener {
	@Override
	public void switchOne() {
		System.out.println("GE fan is running");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE light is running");

	}

	@Override
	public void switchThree() {
		System.out.println("GE bulb is running");

	}

	@Override
	public void switchFour() {
		System.out.println("GE bell is running");

	}
	@Override
	public void wifiSwitch() {
		System.out.println("havells wifi is running");

	}


}
