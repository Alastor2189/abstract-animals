package org.lessons.java.animals;

import Interfacce.Volante;
public class Aquila extends Animals implements Volante {

	public Aquila(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("Verso: huiiiiiiiiiiii");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("Nutrimento: L'aquila caccia i mammiferi, come volpi, lepri, marmotte, conigli selvatici, faine e altre specie del peso di 6-7 kg");
	}
	
	@Override 
	public void faiVolare() {
		System.out.println(getNomeAnimale() + ": Sta volando");
	}
	
	
}
