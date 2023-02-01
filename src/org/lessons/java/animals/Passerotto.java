package org.lessons.java.animals;

public class Passerotto extends Animals implements Volante {
	public Passerotto(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("Verso: cip cip");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("Nutrimento: coleotteri, insetti, cereali");
	}
	
	@Override
	public void faiVolare() {
		System.out.println(getNomeAnimale() + ": Sta volando");
	}
}
