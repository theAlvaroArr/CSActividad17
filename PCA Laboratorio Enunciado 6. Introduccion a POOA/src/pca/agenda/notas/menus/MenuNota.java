package pca.agenda.notas.menus;

import pca.agenda.notas.fabricas.FabricaNotas;
import pca.agenda.notas.modelos.MNota;
import pca.agenda.notas.vistas.VNota;
import pca.util.menus.Auditor;
import pca.util.menus.Menu;
import pca.util.menus.TModoMenu;

public abstract class MenuNota extends Menu {

	protected MNota mNota;

	protected MenuNota(String titulo, TModoMenu modo) {
		super(titulo, modo);
	}

	protected String getTitulo() {
		VNota vNota = FabricaNotas.getFabrica().crearVista(mNota);
		String nombre = vNota.getAbreviatura();
		if (nombre == null) {
			nombre = "<vacio>";
		}
		return super.getTitulo() + " " + nombre;
	}

	public void asociar(MNota mNota, Auditor auditor, VNota vNota) {
		this.mNota = mNota;
		this.asociar(auditor, vNota);
	}

	public abstract MenuNota copia();
}


