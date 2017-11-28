package pca.agenda.contactos.vistas;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MEmergencia;

public class VEmergencia extends VIndividual {

	private MEmergencia mEmergencia;

	public VEmergencia() {
		this.setTextos("EMERGENCIA: ", "Emergencia: ",
				"......................................");
	}

	public void asociar(MContacto mContacto) {
		super.asociar(mContacto);
		this.mEmergencia = (MEmergencia) mContacto;
	}

	public VContacto copia() {
		return new VEmergencia();
	}
}
