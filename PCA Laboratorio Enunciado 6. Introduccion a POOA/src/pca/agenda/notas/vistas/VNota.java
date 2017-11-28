package pca.agenda.notas.vistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pca.agenda.notas.modelos.MNota;
import pca.util.vistas.Vista;

public class VNota extends Vista {

	private MNota mNota;
	private static final int ABREVIATURA = 9;

	public VNota() {
		this.setTextos("NOTA: ", "Nota: ",
				"--------------------------------------");
	}

	public void asociar(MNota mNota) {
		this.mNota = mNota;
	}

	public void mostrar() {
		super.mostrar();
		// TODO 2: Codificar el metodo2
		Iterator<String> it = mNota.getTexto().iterator();
		gestorIO.escribirLinea();
		if(mNota.getTexto().isEmpty()){
			gestorIO.escribirLinea("<VACIO>");
		}else{
			while(it.hasNext()){
				String linea = it.next();
				gestorIO.escribirLinea(linea);
			}	
		}
	}

	public String getAbreviatura() {
		if (mNota.getTexto().isEmpty()) {
			return "<vacía>";
		} else {
			Iterator<String> iterador = mNota.getTexto().iterator();
			String primera = iterador.next();
			if (primera.length() > VNota.ABREVIATURA) {
				primera = primera.substring(0, VNota.ABREVIATURA) + "...";
			}
			return primera;
		}
	}

	public String linea(int posicion) {
		return posicion + ". " + tituloMinusculas + this.getAbreviatura();
	}

	public void recoger() {
		List<String> lineas = new ArrayList<String>();
		String linea;
		int numLineas = 1;
		gestorIO.escribirLinea();
		gestorIO.escribirLinea(
				"[Introduzca una línea en blanco para terminar]");
		do {
			linea = gestorIO.leerString(numLineas + ": ");
			if (!linea.equals("")) {
				lineas.add(linea);
			}
			numLineas++;
		} while (!linea.equals(""));
		mNota.setTexto(lineas);
	}

	public VNota copia() {
		return new VNota();
	}
}
