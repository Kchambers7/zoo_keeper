package com.javaoop.zookeeper;

public class Bat extends Mammal{

	public Bat() {
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Swoosh! (cost 50 energy)");
		this.changeEnergyLevel(-50);
	}
	
	public void eatHuman() {
		System.out.println("so-well nvm (regained 25 energy)");
		this.changeEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("*Sound of the town on fire* (cost 100 energy)");
		this.changeEnergyLevel(-100);
	}
	
}