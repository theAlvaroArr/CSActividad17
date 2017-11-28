package pca.agenda.notas.controladores;

import pca.agenda.notas.fabricas.FabricaNotas;
import pca.agenda.notas.modelos.MBloc;
import pca.agenda.notas.modelos.MNota;

class CAnyadirNota extends CBloc {

	CAnyadirNota(MBloc mBloc) {
		super(mBloc);
	}

	public void controlar() {
		MNota mNota =  FabricaNotas.getFabrica().crearModelo();
		mBloc.anyadir(mNota);
		CEditarNota cEditarNota = new CEditarNota(mNota);
		cEditarNota.controlar();
	}
}
