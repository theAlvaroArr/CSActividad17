package pca.agenda.menus;

import pca.agenda.modelos.TCampoAgenda;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAbrir;

public class MenuAbrirAgenda extends MenuAgenda {

	public MenuAbrirAgenda() {
		super("SERVICIOS DE LA AGENDA", TModoMenu.ITERATIVO);
	}

	public void configurar() {
		this.anyadir(new OAbrir(TCampoAgenda.CONTACTOS));
		this.anyadir(new OAbrir(TCampoAgenda.NOTAS));
	}

	public MenuAgenda copia() {
		return new MenuAbrirAgenda();
	}
}
