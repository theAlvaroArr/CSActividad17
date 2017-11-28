package pca.agenda.notas.menus;

import pca.agenda.notas.fabricas.TBloc;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

public class MenuAbrirBloc extends MenuBloc {

	public MenuAbrirBloc() {
		super("BLOC:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TBloc.BLOC));
		this.anyadir(new OBorrar(TBloc.BLOC));
		this.anyadir(new OAbrir(TBloc.BLOC));
	}

	public MenuBloc copia(){
		return new MenuAbrirBloc();
	}
}
