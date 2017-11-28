package pca.agenda.contactos.modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pca.agenda.contactos.fabricas.FabricaContactos;

public class MDirectorio extends MContacto {

	private ArrayList<MContacto> mContactos;

	public MDirectorio() {
		mContactos = new ArrayList<MContacto>();
	}

	public List<MContacto> getMContactos() {
		return mContactos;
	}

	public void anyadir(MContacto mContacto) {
		mContactos.add(mContacto);
		mContacto.setMDirectorio(this);
	}

	void borrar(MContacto mContacto) {
		mContactos.remove(mContacto);
	}

	public MContacto getMContacto(int posicion) {
		return mContactos.get(posicion);
	}

	public void borrar() {
		List<MContacto> lista = (List<MContacto>) mContactos.clone();
		Iterator<MContacto> iterador = lista.iterator();
		while (iterador.hasNext()) {
			iterador.next().borrar();
		}
		super.borrar();
	}

	public boolean incluye(String nombre) {
		Iterator<MContacto> iterador = mContactos.iterator();
		while (iterador.hasNext()) {
			if (nombre.equals(iterador.next().getNombre())) {
				return true;
			}
		}
		return false;
	}

	public void despachar(FabricaContactos fabrica) {
		fabrica.aceptar(this);
	}

	public MContacto copia() {
		return new MDirectorio();
	}
}
