package pca.agenda.modelos;

import pca.util.Nombrable;

public enum TCampoAgenda implements Nombrable {

	CONTACTOS("contactos"),
	NOTAS("notas");

	private String nombre;

	private TCampoAgenda(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
