package pca.agenda.controladores;

import pca.agenda.contactos.controladores.CAbrirContacto;
import pca.agenda.modelos.TCampoAgenda;
import pca.agenda.notas.controladores.CAbrirBloc;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OSalir;

public class CAbrirAgenda extends CAgenda {

	private CAbrirAgenda() {
		menuAgenda = fabricaAgenda.crearMenu(mAgenda, this, TMenu.ABRIR);
	}

	public void controlar() {
		menuAgenda.ejecutar();
		//despachos
	}

	public void auditar(OAbrir oAbrir) {
		switch ((TCampoAgenda) oAbrir.getTipo()) {
			case CONTACTOS:
				CAbrirContacto cAbrirContacto =
						new CAbrirContacto(mAgenda.getContactos());
				cAbrirContacto.controlar();
				break;
			case NOTAS:
				CAbrirBloc cAbrirBloc =
						new CAbrirBloc(mAgenda.getNotas());
				cAbrirBloc.controlar();
				break;
		}
	}

	public void auditar(OSalir oSalir) {
		CCerrarAgenda cCerrarAgenda = new CCerrarAgenda();
		cCerrarAgenda.controlar();
		if (!cCerrarAgenda.getCerrado()) {
			menuAgenda.reentrar();
		}
	}

	public static void main(String[] args) {
		CAbrirAgenda cAgenda = new CAbrirAgenda();
		cAgenda.controlar();
	}
}
