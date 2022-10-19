package edu.it.ejemplosioc;

import java.io.FileInputStream;
import java.io.InputStream;

interface RunnableConThrows {
	void run() throws Exception;
}

class ExceptionWrapper {
	public static void wrap(RunnableConThrows r) {
		try {
			r.run();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}


public class Ejemplo3 implements Runnable {
	public void run() {
		ExceptionWrapper.wrap(() -> {
			InputStream is = new FileInputStream("/algo/que/no/existe");
		});
	}
}
