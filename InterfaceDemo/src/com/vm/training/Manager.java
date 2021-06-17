package com.vm.training;

public class Manager {

	public static void main(String[] args) {
		//HavellsAppliances havellsAppliances = new HavellsAppliances();
		SwitchListener switchListener = new GEAppliances();
		//new HavellsAppliances();
		
		SwitchListener switchListener1 = new HavellsAppliances();
		
		
		switchListener1.switchOne();
		switchListener1.switchTwo();
		switchListener1.switchThree();
		switchListener1.switchFour();
		switchListener1.wifiSwitch();
		
	}


}
