package edu.it;

interface Imprimible {
	void imprimir();
}

class PdfWriter implements Imprimible {
	public void imprimir() {
		System.out.println("Guardando pdf");
	}
}

class NullObjectPrinter implements Imprimible {
	public void imprimir() {
		System.out.println("Es un comportamiento nulo, no afecta en nada, pero al menos no tengo un null pointer exception");
	}
}

class SrvFacturacion implements Runnable {
	private String razonSocial;
	private String puesto;
	private Imprimible imprimible;
	
	private SrvFacturacion() {
		imprimible = new NullObjectPrinter();
	}
	
	public static SrvFacturacion Build() {
		return new SrvFacturacion();
	}
	
	public SrvFacturacion setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
		return this;
	}
	public SrvFacturacion setPuesto(String puesto) {
		this.puesto = puesto;
		return this;
	}
	public SrvFacturacion setImprimible(Imprimible imprimible) {
		this.imprimible = imprimible;
		return this;
	}
	public void run() {
		System.out.println(razonSocial);
		System.out.println(puesto);
		imprimible.imprimir();
	}
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        SrvFacturacion
        	.Build()
        	.setRazonSocial("Educacion IT")
        	.setPuesto("02")
        	.setImprimible(new PdfWriter())
        	.run();
        
    }
}
