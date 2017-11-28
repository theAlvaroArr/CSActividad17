package pca.agenda.notas.modelos;

import pca.util.Nombrable;

public enum TCampoBloc implements Nombrable {

	NOMBRE("nombre"),
	NOTAS("notas");

	private String nombre;

	private TCampoBloc(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}



