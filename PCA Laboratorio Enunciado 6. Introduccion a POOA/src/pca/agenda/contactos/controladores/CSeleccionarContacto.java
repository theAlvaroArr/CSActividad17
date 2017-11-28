package pca.agenda.contactos.controladores;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MPersona;
import pca.agenda.modelos.MAgenda;
import pca.util.dialogos.DAceptar;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OItem;
import pca.util.menus.opciones.OSeleccionar;

class CSeleccionarContacto extends CContacto {

	private MPersona mContactoSeleccionado;
	private CEditarContacto cEditarContacto;

	CSeleccionarContacto(CEditarContacto cEditarContacto) {
		this(MAgenda.getMAgenda().getContactos(), cEditarContacto);
	}

	private CSeleccionarContacto(MContacto mContacto,
			CEditarContacto cEditarContacto) {
		super(mContacto);
		this.cEditarContacto = cEditarContacto;
		menuContacto = fabricaContactos.crearMenu(mContacto, this,
				TMenu.SELECCIONAR);
	}

	public void controlar() {
		if (menuContacto == null) {
			DAceptar dialogo = fabricaDialogos.crearDAceptar("ERROR:",
					"Este contacto no pueden ser un contacto alternativo");
			dialogo.ejecutar();
		} else {
			menuContacto.ejecutar();
		}
		// despachos
	}

	public void auditar(OSeleccionar oSeleccionar) {
		if (cEditarContacto != null) {
			cEditarContacto.setContactoAlternativo((MPersona) mContacto);
		}
		this.mContactoSeleccionado = (MPersona) mContacto;
		menuContacto.salir();
	}

	public void auditar(OItem oItem) {
		CSeleccionarContacto cSeleccionarContacto = new CSeleccionarContacto(
				((MDirectorio) mContacto).getMContacto(oItem.getPosicion()),
				cEditarContacto);
		cSeleccionarContacto.controlar();
		if (cSeleccionarContacto.getMContactoSeleccionado() != null) {
			this.mContactoSeleccionado =
					cSeleccionarContacto.getMContactoSeleccionado();
			menuContacto.salir();
		}
	}

	MPersona getMContactoSeleccionado() {
		return this.mContactoSeleccionado;
	}
}

