package pca.agenda.notas.fabricas;

import pca.agenda.notas.menus.MenuAbrirNota;
import pca.agenda.notas.menus.MenuEditarNota;
import pca.agenda.notas.menus.MenuNota;
import pca.agenda.notas.modelos.MNota;
import pca.agenda.notas.vistas.VNota;
import pca.util.Nombrable;
import pca.util.menus.TMenu;

public enum TNota implements Nombrable {

	NOTA("nota");

	private String nombre;
	private MNota mNota;
	private VNota vNota;
	private MenuNota[] menusNota;

	private TNota(String nombre) {
		this.nombre = nombre;
		mNota = new MNota();
		vNota = new VNota();
		menusNota = new MenuNota[] {
			new MenuAbrirNota(),
			new MenuEditarNota(),
			null,
			null
		};
	}

	public String getNombre() {
		return nombre;
	}

	MNota crearModelo() {
		if (mNota == null) {
			return null;
		} else {
			return mNota.copia();
		}
	}

	VNota crearVista() {
		if (vNota == null) {
			return null;
		} else {
			return vNota.copia();
		}
	}

	MenuNota crearMenu(TMenu tMenu) {
		MenuNota menu = menusNota[tMenu.ordinal()];
		if (menu == null) {
			return null;
		} else {
			return menu.copia();
		}
	}
}
