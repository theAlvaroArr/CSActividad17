package pca.agenda.notas.controladores;

import pca.agenda.notas.modelos.MNota;
import pca.util.menus.TMenu;

class CEditarNota extends CNota {

	CEditarNota(MNota mNota) {
		super(mNota);
		menuNota = fabricaNotas.crearMenu(mNota, this, TMenu.EDITAR);
	}

	public void controlar() {
		menuNota.ejecutar();
	}
}
