package pca.agenda.notas.modelos;

import pca.util.Nombrable;

public enum TCampoNota implements Nombrable {

	LINEAS("texto");

	private String nombre;

	private TCampoNota(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}


