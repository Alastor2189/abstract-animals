package org.lessons.java.animals;

import Interfacce.Nuotatore;
public class Cane extends Animals implements Nuotatore{
	public Cane(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("Verso: Bau");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("nutrimento: carne e vegetali");
	}
	
	@Override 
	public void faiNuotare() {
		System.out.println(getNomeAnimale() + ": Sta nuotando");
	}
}
