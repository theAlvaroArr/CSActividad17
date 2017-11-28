package pca.agenda.contactos.menus;

import java.util.Iterator;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OItem;

public class MenuSeleccionarDirectorio extends MenuContacto {

	public MenuSeleccionarDirectorio() {
		super("SELECCIONAR CONTACTO DE:", TModoMenu.DINAMICO);
	}

	protected void configurar() {
		MDirectorio mDirectorio = (MDirectorio) mContacto;
		int posicion = 0;
		Iterator<MContacto> iterador = mDirectorio.getMContactos().iterator();
		while (iterador.hasNext()){
			this.anyadir(new OItem(posicion, iterador.next().getNombre()));
			posicion++;
		}
	}

	public MenuContacto copia() {
		return new MenuSeleccionarDirectorio();
	}
}
