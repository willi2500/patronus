package edu.it.ejemplosioc;

import edu.it.utiles.Util;

public class Ejemplo2 implements Runnable {
	public void run() {
		Util.tomarLapsoTiempo("Dos for anidados", () -> {
			for (int j = 0; j < 100; j++) {
				for (int y = 0; y < 1000; y++) {
					System.out.println();
				}
			}
		});
	}
}
