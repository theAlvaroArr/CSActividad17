package pca.agenda.contactos.controladores;

import pca.agenda.contactos.fabricas.TContacto;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAnyadir;

class CAnyadirContacto extends CContacto {

	private MDirectorio mDirectorioDestino;

	CAnyadirContacto(MDirectorio mDirectorioDestino) {
		super(mDirectorioDestino);
		this.mDirectorioDestino = mDirectorioDestino;
		menuContacto = fabricaContactos.crearMenu(mContacto, this,
				TMenu.ANYADIR);
	}

	public void controlar() {
		menuContacto.ejecutar();
		// despachos
	}

	public void auditar(OAnyadir oAnyadir) {
		MContacto mContactoNuevo = fabricaContactos.crearModelo(
				(TContacto) oAnyadir.getTipo());
		mDirectorioDestino.anyadir(mContactoNuevo);
		CEditarContacto cEditarContacto = new CEditarContacto(mContactoNuevo);
		cEditarContacto.controlar();
	}
}
