package pca.agenda.contactos.controladores;

import pca.agenda.contactos.modelos.MContacto;
import pca.util.dialogos.DAceptar;
import pca.util.dialogos.DAceptarCancelar;

class CBorrarContacto extends CContacto {

	private boolean borrado = false;

	CBorrarContacto(MContacto mContacto) {
		super(mContacto);
	}

	public void controlar() {
		if (mContacto.getMDirectorio() == null) {
			DAceptar dError = fabricaDialogos.crearDAceptar("ERROR:",
					"No se puede borrar el directorio raiz!!!");
			dError.ejecutar();
		} else {
			DAceptarCancelar dConfirmar = fabricaDialogos.crearDAceptarCancelar(
					"AVISO:", "Se perderan los datos del contacto '" +
					mContacto.getNombre() + "'!!!");
			dConfirmar.ejecutar();
			if (dConfirmar.aceptado()) {
				mContacto.borrar();
				borrado = true;
			}
		}
	}

	boolean borrado() {
		return borrado;
	}
}
