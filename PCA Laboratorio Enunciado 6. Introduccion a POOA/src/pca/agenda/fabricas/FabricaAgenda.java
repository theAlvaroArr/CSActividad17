package pca.agenda.fabricas;

import pca.agenda.controladores.CAgenda;
import pca.agenda.menus.MenuAgenda;
import pca.agenda.modelos.MAgenda;
import pca.agenda.vistas.VAgenda;
import pca.util.menus.TMenu;

public class FabricaAgenda {

	private static FabricaAgenda fabrica = new FabricaAgenda();

	public static FabricaAgenda getFabrica() {
		return fabrica;
	}

	private FabricaAgenda() {
	}

	private TAgenda tAgenda = TAgenda.AGENDA;

	public VAgenda crearVista(MAgenda mAgenda) {
		VAgenda vAgenda = tAgenda.crearVista();
		if (vAgenda != null) {
			vAgenda.asociar(mAgenda);
		}
		return vAgenda;
	}

	public MenuAgenda crearMenu(MAgenda mAgenda, CAgenda cAgenda,
			TMenu tMenu) {
		MenuAgenda menuAgenda = tAgenda.crearMenu(tMenu);
		if (menuAgenda != null) {
			VAgenda vAgenda = this.crearVista(mAgenda);
			menuAgenda.asociar(mAgenda, cAgenda, vAgenda);
		}
		return menuAgenda;
	}
}

