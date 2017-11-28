package pca.agenda.notas.controladores;

import pca.agenda.notas.modelos.MNota;
import pca.util.dialogos.DAceptar;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

class CAbrirNota extends CNota {

	CAbrirNota(MNota mNota) {
		super(mNota);
		menuNota = fabricaNotas.crearMenu(mNota, this, TMenu.ABRIR);
	}

	public void controlar() {
		// TODO 3: Codificar el metodo
		menuNota.ejecutar();
	}

	public void auditar(OEditar oEditar) {
		// TODO 3: Codificar el metodo
		CEditarNota cEditarNota = new CEditarNota(mNota);
		cEditarNota.controlar();
	}

	public void auditar(OBorrar oBorrar) {
		// TODO 3: Codificar el metodo
		CBorrarNota cBorrarNota = new CBorrarNota(mNota);
		cBorrarNota.controlar();
		if(cBorrarNota.borrado()){
			menuNota.salir();
		}
	}
}
