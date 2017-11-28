package pca.agenda.contactos.vistas;

import java.util.Iterator;
import java.util.List;
import pca.agenda.contactos.fabricas.FabricaContactos;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;

public class VDirectorio extends VContacto {

	private MDirectorio mDirectorio;

	public VDirectorio() {
		this.setTextos("DIRECTORIO: ", "Directorio: ",
				"--------------------------------------");
	}

	public void asociar(MContacto mContacto) {
		super.asociar(mContacto);
		this.mDirectorio = (MDirectorio) mContacto;
	}

	public void mostrar() {
		super.mostrar();
		gestorIO.escribirLinea("Contactos:");
		List<MContacto> mContactos = mDirectorio.getMContactos();
		if (mContactos.isEmpty()) {
			gestorIO.escribirLinea("NO EXISTEN CONTACTOS.");
		} else {
			int posicion = 1;
			Iterator<MContacto> iterador = mContactos.iterator();
			while (iterador.hasNext()){
				gestorIO.escribirLinea(FabricaContactos.getFabrica().crearVista(
						iterador.next()).linea(posicion));
				posicion++;
			}
		}
	}

	public String linea(int posicion) {
		return posicion + ". " + tituloMinusculas +
				this.getCampo(mDirectorio.getNombre());
	}

	public VContacto copia() {
		return new VDirectorio();
	}
}
