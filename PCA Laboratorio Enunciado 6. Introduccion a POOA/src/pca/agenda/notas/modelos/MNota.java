package pca.agenda.notas.modelos;

import java.util.ArrayList;
import java.util.List;
import pca.agenda.modelos.MAgenda;

public class MNota {

	// TODO 1: Codificar los atributos
	List<String> listaString;

	public MNota() {
		// TODO 1: Codificar el metodo
		listaString = new ArrayList<String>();
	}

	public void setTexto(List<String> lineas) {
		listaString = lineas;
	}

	public List<String> getTexto() {
		// TODO 1: Codificar el metodo
		return this.listaString;
	}

	public void borrar() {
		// TODO 1: Codificar el metodo
		MAgenda.getMAgenda().getNotas().borrar(this);
	}

	public MNota copia(){
		return new MNota();
	}
}
