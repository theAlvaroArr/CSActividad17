package pca.agenda.notas.menus;

import pca.agenda.notas.modelos.MBloc;
import pca.agenda.notas.vistas.VBloc;
import pca.util.menus.Auditor;
import pca.util.menus.Menu;
import pca.util.menus.TModoMenu;

public abstract class MenuBloc extends Menu {

	protected MBloc mBloc;

	protected MenuBloc(String titulo, TModoMenu modo) {
		super(titulo, modo);
	}

	protected String getTitulo() {
		String nombre = mBloc.getNombre();
		if (nombre == null) {
			nombre = "<vacio>";
		}
		return super.getTitulo() + " " + nombre;
	}

	public void asociar(MBloc mBloc, Auditor auditor, VBloc vBloc) {
		this.mBloc = mBloc;
		this.asociar(auditor, vBloc);
	}

	public abstract MenuBloc copia();
}

