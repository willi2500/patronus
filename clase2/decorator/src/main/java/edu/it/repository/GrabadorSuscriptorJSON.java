package edu.it.repository;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import edu.it.dtos.Suscriptor;

public class GrabadorSuscriptorJSON implements GrabadorSuscriptor {

	@Override
	public void grabar(Suscriptor suscriptor) {
		try {
			var path = String.join("", "/var/patronus/ventas/", suscriptor.id, ".json");
			FileUtils.write(new File(path), new Gson().toJson(suscriptor), "utf-8");
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}
