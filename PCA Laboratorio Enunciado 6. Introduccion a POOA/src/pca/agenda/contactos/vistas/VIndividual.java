package pca.agenda.contactos.vistas;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MIndividual;

abstract class VIndividual extends VContacto {

	private MIndividual mIndividual;

	public void asociar(MContacto mContacto) {
		super.asociar(mContacto);
		this.mIndividual = (MIndividual) mContacto;
	}

	public void mostrar() {
		super.mostrar();
		gestorIO.escribirLinea("Telefono: " +
				this.getCampo(mIndividual.getTelefono()));
	}

	public String linea(int posicion) {
		return posicion + ". " + tituloMinusculas +
				this.getCampo(mIndividual.getNombre()) +
				" (" + this.getCampo(mIndividual.getTelefono()) + ")";
	}
}

