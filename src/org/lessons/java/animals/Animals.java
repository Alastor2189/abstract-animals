package org.lessons.java.animals;

public abstract class Animals {
	
	private String nomeAnimale;

	public Animals(String nomeAnimale) {
		super();
		this.nomeAnimale = nomeAnimale;
	}
	
	public String getNomeAnimale() {
		return nomeAnimale;
	}
	
	public void dorme() {
		System.out.println("zzzzzz");
	}
	
	public abstract void esecuzioneVerso();
	
	public abstract void nutrimento();
}
