package pca.agenda.notas.fabricas;

import pca.agenda.notas.menus.MenuAbrirBloc;
import pca.agenda.notas.menus.MenuBloc;
import pca.agenda.notas.menus.MenuEditarBloc;
import pca.agenda.notas.menus.MenuSeleccionarBloc;
import pca.agenda.notas.modelos.MBloc;
import pca.agenda.notas.vistas.VBloc;
import pca.util.Nombrable;
import pca.util.menus.TMenu;

public enum TBloc implements Nombrable {

	BLOC("bloc");

	private String nombre;
	private MBloc mBloc;
	private VBloc vBloc;
	private MenuBloc[] menusBloc;

	private TBloc(String nombre) {
		this.nombre = nombre;
		mBloc = new MBloc();
		vBloc = new VBloc();
		menusBloc = new MenuBloc[] {
			new MenuAbrirBloc(),
			new MenuEditarBloc(),
			new MenuSeleccionarBloc(),
			null
		};
	}

	public String getNombre() {
		return nombre;
	}

	MBloc crearModelo() {
		if (mBloc == null) {
			return null;
		} else {
			return mBloc.copia();
		}
	}

	VBloc crearVista() {
		if (vBloc == null) {
			return null;
		} else {
			return vBloc.copia();
		}
	}

	MenuBloc crearMenu(TMenu tMenu) {
		MenuBloc menu = menusBloc[tMenu.ordinal()];
		if (menu == null) {
			return null;
		} else {
			return menu.copia();
		}
	}
}
