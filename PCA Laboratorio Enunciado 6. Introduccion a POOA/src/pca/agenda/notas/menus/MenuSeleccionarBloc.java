package pca.agenda.notas.menus;

import java.util.Iterator;
import pca.agenda.notas.fabricas.FabricaNotas;
import pca.agenda.notas.modelos.MNota;
import pca.agenda.notas.vistas.VNota;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OItem;

public class MenuSeleccionarBloc extends MenuBloc {

	public MenuSeleccionarBloc() {
		super("SELECCIONAR NOTA DE:", TModoMenu.DINAMICO);
	}

	protected void configurar() {
		Iterator<MNota> iterador = mBloc.getMNotas().iterator();
		int posicion = 0;
		while (iterador.hasNext()) {
			VNota vNota = FabricaNotas.getFabrica().crearVista(iterador.next());
			this.anyadir(new OItem(posicion, vNota.getAbreviatura()));
			posicion++;
		}
	}

	public MenuBloc copia(){
		return new MenuSeleccionarBloc();
	}
}

