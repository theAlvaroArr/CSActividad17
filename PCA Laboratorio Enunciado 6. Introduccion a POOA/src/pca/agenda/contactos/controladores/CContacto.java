package pca.agenda.contactos.controladores;

import pca.agenda.contactos.fabricas.FabricaContactos;
import pca.agenda.contactos.menus.MenuContacto;
import pca.agenda.contactos.modelos.MContacto;
import pca.util.controladores.Controlador;
import pca.util.dialogos.FabricaDialogos;
import pca.util.menus.Auditor;

public abstract class CContacto extends Auditor implements Controlador {

	protected MContacto mContacto;
	protected MenuContacto menuContacto;
	protected static FabricaContactos fabricaContactos =
			FabricaContactos.getFabrica();
	protected static FabricaDialogos fabricaDialogos =
			FabricaDialogos.getFabrica();

	CContacto(MContacto mContacto) {
		this.mContacto = mContacto;
		menuContacto = null;
	}
}
