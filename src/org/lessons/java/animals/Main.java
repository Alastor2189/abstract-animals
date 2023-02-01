package org.lessons.java.animals;

public class Main {
	public static void main(String[] args) {
		
		Aquila a = new Aquila("Eagle");
		Cane c = new Cane("Dog");
		Delfino d = new Delfino("Dolphin");
		Passerotto p = new Passerotto("Sparrow");
		
		System.out.println(a.getNomeAnimale());
		a.esecuzioneVerso();
		a.nutrimento();
		a.dorme();
		
		System.out.println(c.getNomeAnimale());
		c.esecuzioneVerso();
		c.nutrimento();
		c.dorme();
		
		System.out.println(d.getNomeAnimale());
		d.esecuzioneVerso();
		d.nutrimento();
		d.dorme();
		
		System.out.println(p.getNomeAnimale());
		p.esecuzioneVerso();
		p.nutrimento();
		p.dorme();
	}
	
	
}
