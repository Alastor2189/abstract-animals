package org.lessons.java.animals;

public class Cane extends Animals{
	public Cane(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("Bau");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("carne e vegetali");
	}
}
