package org.lessons.java.animals;

public class Passerotto extends Animals {
	public Passerotto(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("cip cip");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("coleotteri, insetti, cereali");
	}
}
