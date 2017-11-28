package pca.agenda.notas.menus;

import pca.agenda.notas.fabricas.TNota;
import pca.agenda.notas.modelos.TCampoBloc;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAnyadir;
import pca.util.menus.opciones.OEditar;

public class MenuEditarBloc extends MenuBloc {

	public MenuEditarBloc() {
		super("EDITAR BLOC:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TCampoBloc.NOMBRE));
		this.anyadir(new OAnyadir(TNota.NOTA));
	}

	public MenuBloc copia(){
		return new MenuEditarBloc();
	}
}

