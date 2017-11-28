package pca.agenda.menus;

import pca.agenda.modelos.MAgenda;
import pca.agenda.vistas.VAgenda;
import pca.util.menus.Auditor;
import pca.util.menus.Menu;
import pca.util.menus.TModoMenu;

public abstract class MenuAgenda extends Menu {

	protected MAgenda mAgenda;

	protected MenuAgenda(String titulo, TModoMenu modo) {
		super(titulo, modo);
	}

	public void asociar(MAgenda mAgenda, Auditor auditor, VAgenda vAgenda) {
		this.mAgenda = mAgenda;
		this.asociar(auditor, vAgenda);
	}

	public abstract MenuAgenda copia();
}
