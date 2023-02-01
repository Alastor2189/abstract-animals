package org.lessons.java.animals;

import TipologiaAzione.TipologiaAzione;
public class Main {
	public static void main(String[] args) {
		
		TipologiaAzione tA = new TipologiaAzione();
		Aquila a = new Aquila("Eagle");
		Cane c = new Cane("Dog");
		Delfino d = new Delfino("Dolphin");
		Passerotto p = new Passerotto("Sparrow");
		
		System.out.println(a.getNomeAnimale());
		a.esecuzioneVerso();
		a.nutrimento();
		a.dorme();
		tA.falloVolare(a);
		
		System.out.println(c.getNomeAnimale());
		c.esecuzioneVerso();
		c.nutrimento();
		c.dorme();
		tA.falloNuotare(c);
		
		System.out.println(d.getNomeAnimale());
		d.esecuzioneVerso();
		d.nutrimento();
		d.dorme();
		tA.falloNuotare(d);
		
		System.out.println(p.getNomeAnimale());
		p.esecuzioneVerso();
		p.nutrimento();
		p.dorme();
		tA.falloVolare(p);
		
		
		
		
		
		
	}
	
	
}
