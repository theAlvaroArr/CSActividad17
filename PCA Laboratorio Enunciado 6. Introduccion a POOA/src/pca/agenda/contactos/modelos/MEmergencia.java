package pca.agenda.contactos.modelos;

// TODO 5: Ampliar para incorporar doble despacho de MEmergencia

import pca.agenda.contactos.fabricas.FabricaContactos;

public class MEmergencia extends MIndividual {

	public MContacto copia() {
		return new MEmergencia();
	}
	public void despachar(FabricaContactos fabrica) {
		fabrica.aceptar(this);
	}
}
