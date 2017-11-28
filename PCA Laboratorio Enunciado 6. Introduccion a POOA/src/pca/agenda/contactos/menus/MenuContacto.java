package pca.agenda.contactos.menus;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.vistas.VContacto;
import pca.util.menus.Auditor;
import pca.util.menus.Menu;
import pca.util.menus.TModoMenu;

public abstract class MenuContacto extends Menu {

	protected MContacto mContacto;

	protected MenuContacto(String titulo, TModoMenu modo) {
		super(titulo, modo);
	}

	protected String getTitulo() {
		String nombre = mContacto.getNombre();
		if (nombre == null) {
			nombre = "<vacio>";
		}
		return super.getTitulo() + " " + nombre;
	}

	public void asociar(MContacto mContacto, Auditor auditor,
			VContacto vContacto) {
		this.mContacto = mContacto;
		this.asociar(auditor, vContacto);
	}

	public abstract MenuContacto copia();
}
