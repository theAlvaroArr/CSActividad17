package pca.agenda.notas.vistas;

import java.util.Iterator;
import java.util.List;
import pca.agenda.notas.fabricas.FabricaNotas;
import pca.agenda.notas.modelos.MBloc;
import pca.agenda.notas.modelos.MNota;
import pca.util.vistas.Vista;

public class VBloc extends Vista {

	private MBloc mBloc;

	public VBloc() {
		this.setTextos("BLOC: ", "Bloc: ",
				"--------------------------------------");
	}

	public void asociar(MBloc mBloc) {
		this.mBloc = mBloc;
	}

	public void mostrar() {
		super.mostrar();
		gestorIO.escribirLinea("Nombre: " + this.getCampo(mBloc.getNombre()));
		gestorIO.escribirLinea("Notas:");
		List<MNota> mNotas = mBloc.getMNotas();
		if (mNotas.isEmpty()) {
			gestorIO.escribirLinea("NO EXISTEN NOTAS.");
		} else {
			int posicion = 1;
			Iterator<MNota> iterador = mNotas.iterator();
			while (iterador.hasNext()) {
				gestorIO.escribirLinea(FabricaNotas.getFabrica().crearVista(
						iterador.next()).linea(posicion));
				posicion++;
			}
		}
	}

	public String linea(int posicion) {
		return posicion + ". " + tituloMinusculas +
				this.getCampo(mBloc.getNombre());
	}

	public VBloc copia(){
		return new VBloc();
	}
}
