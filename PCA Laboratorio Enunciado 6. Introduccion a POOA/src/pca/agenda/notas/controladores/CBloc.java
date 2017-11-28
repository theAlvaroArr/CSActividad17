package pca.agenda.notas.controladores;

import pca.agenda.notas.fabricas.FabricaBlocs;
import pca.agenda.notas.menus.MenuBloc;
import pca.agenda.notas.modelos.MBloc;
import pca.util.controladores.Controlador;
import pca.util.dialogos.FabricaDialogos;
import pca.util.menus.Auditor;

public abstract class CBloc extends Auditor implements Controlador {

	protected MBloc mBloc;
	protected MenuBloc menuBloc;
	protected static FabricaBlocs fabricaBlocs =
			FabricaBlocs.getFabrica();
	protected static FabricaDialogos fabricaDialogos =
			FabricaDialogos.getFabrica();

	CBloc(MBloc mBloc) {
		this.mBloc = mBloc;
		menuBloc = null;
	}
}
