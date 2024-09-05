package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
	

		
		Gato x = new Gato();
		Cachorro y = new Cachorro();
		Vaca l = new Vaca();
		
		System.out.println("Gato: " + x.emitirsom());
		System.out.println("Cachorro: " + y.emitirsom());
		System.out.println("Vaca: " + l.emitirsom());
	}

}
