package pca.agenda.fabricas;

import pca.agenda.menus.MenuAbrirAgenda;
import pca.agenda.menus.MenuAgenda;
import pca.agenda.vistas.VAgenda;
import pca.util.Nombrable;
import pca.util.menus.TMenu;

public enum TAgenda implements Nombrable {

	AGENDA("agenda");

	private String nombre;
	private VAgenda vAgenda;
	private MenuAgenda[] menusAgenda;

	private TAgenda(String nombre) {
		this.nombre = nombre;
		vAgenda = new VAgenda();
		menusAgenda = new MenuAgenda[] {
			new MenuAbrirAgenda(),
			null,
			null,
			null
		};
	}

	public String getNombre() {
		return nombre;
	}

	VAgenda crearVista() {
		if (vAgenda == null) {
			return null;
		} else {
			return vAgenda.copia();
		}
	}

	MenuAgenda crearMenu(TMenu tMenu) {
		MenuAgenda menu = menusAgenda[tMenu.ordinal()];
		if (menu == null) {
			return null;
		} else {
			return menu.copia();
		}
	}
}