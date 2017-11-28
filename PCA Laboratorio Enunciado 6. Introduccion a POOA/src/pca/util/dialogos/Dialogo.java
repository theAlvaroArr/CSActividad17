package pca.util.dialogos;

import pca.util.GestorIO;

abstract class Dialogo {

	protected String titulo;
	protected String mensaje;
	protected static GestorIO gestorIO = GestorIO.getGestorIO();

	protected Dialogo(String titulo, String mensaje) {
		this.titulo = titulo;
		this.mensaje = mensaje;
	}

	public void ejecutar() {
		gestorIO.escribirLinea();
		gestorIO.escribirLinea(titulo);
	}
}
