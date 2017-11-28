package pca.agenda.notas.controladores;

import pca.agenda.notas.modelos.MBloc;
import pca.util.dialogos.DAceptar;
import pca.util.dialogos.DEntrada;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAnyadir;
import pca.util.menus.opciones.OEditar;

class CEditarBloc extends CBloc {

	CEditarBloc(MBloc mBloc){
		super(mBloc);
		menuBloc = fabricaBlocs.crearMenu(mBloc, this, TMenu.EDITAR);
	}

	public void controlar() {
		menuBloc.ejecutar();
		// despachos
	}

	public void auditar(OEditar oEditar) {
		boolean salir = false;
		do {
			DEntrada dValor = fabricaDialogos.crearDEntrada(
					oEditar.getTitulo() + ":",
					"Introduzca el nuevo valor? ");
			dValor.ejecutar();
			String nombre = dValor.getString();
			String anterior = mBloc.getNombre();
			if (nombre == null && anterior != null) {
				salir = true;
			} else if (nombre == null || nombre.equals("")) {
				DAceptar dVacio = fabricaDialogos.crearDAceptar("ERROR:",
						"El nombre no puede estar vacio!!!!");
				dVacio.ejecutar();
			} else {
				mBloc.setNombre(nombre);
				salir = true;
			}
		} while (!salir);
	}

	public void auditar(OAnyadir oAnyadir) {
		CAnyadirNota cAnyadirNota = new CAnyadirNota(mBloc);
		cAnyadirNota.controlar();
	}
}
