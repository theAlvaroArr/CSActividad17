package pca.agenda.notas.controladores;

import pca.agenda.notas.menus.MenuBloc;
import pca.agenda.notas.modelos.MBloc;
import pca.util.dialogos.DAceptar;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;
import pca.util.menus.opciones.OItem;

public class CAbrirBloc extends CBloc {

	public CAbrirBloc(MBloc mBloc) {
		super(mBloc);
		menuBloc = fabricaBlocs.crearMenu(mBloc, this, TMenu.ABRIR);
	}

	public void controlar() {
		menuBloc.ejecutar();
		//despachos
	}

	public void auditar(OEditar oEditar) {
		CEditarBloc cEditarBloc = new CEditarBloc(mBloc);
		cEditarBloc.controlar();
	}

	public void auditar(OBorrar oBorrar) {
		DAceptar dError = fabricaDialogos.crearDAceptar("ERROR:",
				"No se puede borrar el bloc de notas!!!");
		dError.ejecutar();
	}

	public void auditar(OAbrir oAbrir) {
		MenuBloc menuSeleccionar = fabricaBlocs.crearMenu(mBloc, this,
				TMenu.SELECCIONAR);
		menuSeleccionar.ejecutar();
	}

	public void auditar(OItem oItem) {
		CAbrirNota cAbrirNota = new CAbrirNota(
				mBloc.getMNota(oItem.getPosicion()));
		cAbrirNota.controlar();
	}
}
