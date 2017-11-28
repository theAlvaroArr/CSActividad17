package pca.util.vistas;

import pca.util.GestorIO;

public abstract class Vista {

	protected String tituloMayusculas;
	protected String tituloMinusculas;
	protected String separador;
	protected static GestorIO gestorIO = GestorIO.getGestorIO();

	public void mostrar() {
		gestorIO.escribirLinea();
		gestorIO.escribirLinea(separador);
		gestorIO.escribirLinea(tituloMayusculas);
	}

	public abstract String linea(int posicion);

	protected void setTextos(String tituloMayusculas, String tituloMinusculas,
			String separador) {
		this.tituloMayusculas = tituloMayusculas;
		this.tituloMinusculas = tituloMinusculas;
		this.separador = separador;
	}

	protected String getCampo(String campo) {
		if (campo == null || campo.equals("")) {
			campo = "<vacio>";
		}
		return campo;
	}
}
