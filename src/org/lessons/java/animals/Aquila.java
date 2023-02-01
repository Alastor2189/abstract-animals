package org.lessons.java.animals;

public class Aquila extends Animals {

	public Aquila(String nomeAnimale) {
		super(nomeAnimale);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esecuzioneVerso() {
		System.out.println("huiiiiiiiiiiii");
	}
	
	@Override
	public void nutrimento() {
		System.out.print("L'aquila caccia i mammiferi, come volpi, lepri, marmotte, conigli selvatici, faine e altre specie del peso di 6-7 kg");
	}
	
	
}
