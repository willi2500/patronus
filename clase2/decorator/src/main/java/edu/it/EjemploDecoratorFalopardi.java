package edu.it;

interface MuestraAlgo {
	void mostrar(Integer t);
}

class MuestraNumero implements MuestraAlgo {
	public void mostrar(Integer x) {
		System.out.println(x);
	}
}

class AgregaAsteriscos implements MuestraAlgo {
	private MuestraAlgo muestraAlgo;

	public AgregaAsteriscos(MuestraAlgo muestraAlgo) {
		this.muestraAlgo = muestraAlgo;
	}
	public void mostrar(Integer x) {
		System.out.print("**");
		muestraAlgo.mostrar(x);
	}
}

public class EjemploDecoratorFalopardi {
	MuestraNumero mn = new MuestraNumero();
	AgregaAsteriscos aa = new AgregaAsteriscos(mn);
	MuestraAlgo interfaz = null;
	
	public void run() {
		for (Integer x = 1; x < 30; x++) {
			if (x % 2 == 0) {
				interfaz = mn;
			}
			else {
				interfaz = aa;
			}
			
			/*********
			 * Ejercicio: Si es el numero 13 ? agregarle un decorator.. que diga Lo que significa para ustedes
			 * DISCLAIMER: SIN TOCAR CODIGO !!!!! Excepto en el factory
			 */
			
			// Ya esta asignado ************ ACA PONER LA LUPA 
			interfaz.mostrar(x);
			//////////////////////////////////////////////////
		}
	}
}
