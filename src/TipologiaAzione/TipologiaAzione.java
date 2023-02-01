package TipologiaAzione;

import Interfacce.Nuotatore;
import Interfacce.Volante;

public class TipologiaAzione {
	public void falloVolare(Volante a) {
		a.saVolare();
	}
	
	public void falloNuotare(Nuotatore a) {
		a.saNuotare();
	}
}
