package pca.agenda.notas.fabricas;

import pca.agenda.notas.controladores.CBloc;
import pca.agenda.notas.menus.MenuBloc;
import pca.agenda.notas.modelos.MBloc;
import pca.agenda.notas.vistas.VBloc;
import pca.util.menus.TMenu;

public class FabricaBlocs {

	private static FabricaBlocs fabrica = new FabricaBlocs();

	public static FabricaBlocs getFabrica() {
		return fabrica;
	}

	private FabricaBlocs() {
	}

	private TBloc tBloc = TBloc.BLOC;

	public MBloc crearModelo() {
		return tBloc.crearModelo();
	}

	public VBloc crearVista(MBloc mBloc) {
		VBloc vBloc = tBloc.crearVista();
		if (vBloc != null) {
			vBloc.asociar(mBloc);
		}
		return vBloc;
	}

	public MenuBloc crearMenu(MBloc mBloc, CBloc cBloc,
			TMenu tMenu) {
		MenuBloc menuBloc = tBloc.crearMenu(tMenu);
		if (menuBloc != null) {
			VBloc vBloc = this.crearVista(mBloc);
			menuBloc.asociar(mBloc, cBloc, vBloc);
		}
		return menuBloc;
	}
}

