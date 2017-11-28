package pca.agenda.vistas;

import pca.agenda.modelos.MAgenda;
import pca.util.vistas.Vista;

public class VAgenda extends Vista {

	private MAgenda mAgenda;

	public VAgenda() {
		this.setTextos("AGENDA: ", "Agenda: ",
				"**************************************");
	}

	public void asociar(MAgenda mAgenda) {
		this.mAgenda = mAgenda;
	}

	public void mostrar() {
		gestorIO.escribirLinea();
		gestorIO.escribirLinea(separador);
	}

	public String linea(int posicion) {
		return posicion + ". " + tituloMinusculas;
	}

	public VAgenda copia(){
		return new VAgenda();
	}
}
