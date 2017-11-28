package pca.agenda.controladores;

import pca.util.dialogos.DAceptarCancelar;

class CCerrarAgenda extends CAgenda {

	private boolean cerrado = false;

	public void controlar() {
		DAceptarCancelar dConfirmar = fabricaDialogos.crearDAceptarCancelar(
				"AVISO:", "Abandonar la aplicacion?");
		dConfirmar.ejecutar();
		if (dConfirmar.aceptado()) {
			cerrado = true;
		}
	}

	boolean getCerrado() {
		return cerrado;
	}
}
