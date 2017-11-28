package pca.agenda.notas.controladores;

import pca.agenda.notas.modelos.MNota;
import pca.agenda.notas.vistas.VNota;
import pca.util.dialogos.DAceptarCancelar;

class CBorrarNota extends CNota {

	private VNota vNota;
	private boolean borrado = false;

	CBorrarNota(MNota mNota) {
		super(mNota);
		vNota = fabricaNotas.crearVista(mNota);
	}

	public void controlar() {
		DAceptarCancelar dConfirmar = fabricaDialogos.crearDAceptarCancelar(
				"AVISO:", "Se perderan los datos de la nota '" +
				vNota.getAbreviatura() + "'!!!");
		dConfirmar.ejecutar();
		if (dConfirmar.aceptado()) {
			mNota.borrar();
			borrado = true;
		}
	}

	boolean borrado() {
		return borrado;
	}
}
