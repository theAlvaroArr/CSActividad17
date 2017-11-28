package pca.agenda.notas.fabricas;

import pca.agenda.notas.controladores.CNota;
import pca.agenda.notas.menus.MenuNota;
import pca.agenda.notas.modelos.MNota;
import pca.agenda.notas.vistas.VNota;
import pca.util.menus.TMenu;

public class FabricaNotas {

	private static FabricaNotas fabrica = new FabricaNotas();

	public static FabricaNotas getFabrica() {
		return fabrica;
	}

	private FabricaNotas() {
	}

	private TNota tNota = TNota.NOTA;

	public MNota crearModelo() {
		return tNota.crearModelo();
	}

	public VNota crearVista(MNota mNota) {
		VNota vNota = tNota.crearVista();
		if (vNota != null) {
			vNota.asociar(mNota);
		}
		return vNota;
	}

	public MenuNota crearMenu(MNota mNota, CNota cNota,
			TMenu tMenu) {
		MenuNota menuNota = tNota.crearMenu(tMenu);
		if (menuNota != null) {
			VNota vNota = this.crearVista(mNota);
			menuNota.asociar(mNota, cNota, vNota);
		}
		return menuNota;
	}
}

