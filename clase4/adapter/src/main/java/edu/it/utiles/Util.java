package edu.it.utiles;

public class Util {
	public static void dormir() {
		try { Thread.sleep(3000); } catch (Exception ex) {};
	}
	// @Around
	public static void tomarLapsoTiempo(String titulo, Runnable r) {
		System.out.println("Tomando tiempo de: " + titulo);
		long antes = System.currentTimeMillis();
		r.run();
		long despues = System.currentTimeMillis();
		long diferencia = despues - antes;
		System.out.println();
		System.out.println("Esto tarda.. " + String.valueOf(diferencia) + " ms");
	}
}
