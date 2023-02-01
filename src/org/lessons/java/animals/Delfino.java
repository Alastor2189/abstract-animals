package org.lessons.java.animals;

public class Delfino extends Animals implements Nuotatore {
	public Delfino(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("Verso: wiiiiii");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("Nutrimento: pesci come acciughe, sardine, aringhe, seppie e calamari");
	}
	
	@Override
	public void faiNuotare() {
		System.out.println(getNomeAnimale() + " Sta nuotando");
	}
	
}
