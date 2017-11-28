package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAnyadir;

public class MenuAnyadirContacto extends MenuContacto {

	public MenuAnyadirContacto() {
		super("TIPO DE CONTACTO para:", TModoMenu.ALTERNATIVO);
	}

	protected void configurar() {
		this.anyadir(new OAnyadir(TContacto.PERSONA));
		this.anyadir(new OAnyadir(TContacto.EMERGENCIA));
		this.anyadir(new OAnyadir(TContacto.DIRECTORIO));
	}

	public MenuContacto copia() {
		return new MenuAnyadirContacto();
	}
}
