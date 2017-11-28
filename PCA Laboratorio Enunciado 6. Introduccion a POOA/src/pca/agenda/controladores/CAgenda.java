package pca.agenda.controladores;

import pca.agenda.fabricas.FabricaAgenda;
import pca.agenda.menus.MenuAgenda;
import pca.agenda.modelos.MAgenda;
import pca.util.controladores.Controlador;
import pca.util.dialogos.FabricaDialogos;
import pca.util.menus.Auditor;

public abstract class CAgenda extends Auditor implements Controlador {

	protected static MAgenda mAgenda = MAgenda.getMAgenda();
	protected MenuAgenda menuAgenda = null;
	protected static FabricaAgenda fabricaAgenda =
			FabricaAgenda.getFabrica();
	protected static FabricaDialogos fabricaDialogos =
			FabricaDialogos.getFabrica();
}
