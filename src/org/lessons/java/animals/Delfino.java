package org.lessons.java.animals;

public class Delfino extends Animals {
	public Delfino(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("wiiiiii");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("pesci come acciughe, sardine, aringhe, seppie e calamari");
	}
}
