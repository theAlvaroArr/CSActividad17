package pca.agenda.notas.controladores;

import pca.agenda.notas.fabricas.FabricaNotas;
import pca.agenda.notas.menus.MenuNota;
import pca.agenda.notas.modelos.MNota;
import pca.util.controladores.Controlador;
import pca.util.dialogos.FabricaDialogos;
import pca.util.menus.Auditor;

public abstract class CNota extends Auditor implements Controlador {

	protected MNota mNota;
	protected MenuNota menuNota;
	protected static FabricaNotas fabricaNotas =
			FabricaNotas.getFabrica();
	protected static FabricaDialogos fabricaDialogos =
			FabricaDialogos.getFabrica();

	CNota(MNota mNota) {
		this.mNota = mNota;
		menuNota = null;
	}
}
