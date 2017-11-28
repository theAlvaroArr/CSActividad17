package pca.util.menus.opciones;

import pca.util.menus.Auditor;

public abstract class Opcion {

	protected String titulo;

	Opcion(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		String titulo = this.titulo;
		if (titulo == null) {
			titulo = "<vacio>";
		}
		return titulo;
	}

	public abstract void despachar(Auditor auditor);
}
