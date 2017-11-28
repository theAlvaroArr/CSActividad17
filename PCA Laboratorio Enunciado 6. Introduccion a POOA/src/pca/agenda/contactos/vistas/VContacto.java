package pca.agenda.contactos.vistas;

import pca.agenda.contactos.modelos.MContacto;
import pca.util.vistas.Vista;

public abstract class VContacto extends Vista {

	private MContacto mContacto;

	public void asociar(MContacto mContacto) {
		this.mContacto = mContacto;
	}
	
	public void mostrar() {
		super.mostrar();
		gestorIO.escribirLinea("Nombre: " +
				this.getCampo(mContacto.getNombre()));
	}

	public abstract VContacto copia();
}
