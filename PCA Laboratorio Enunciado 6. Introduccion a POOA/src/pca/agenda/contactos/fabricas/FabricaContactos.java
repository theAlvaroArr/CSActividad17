package pca.agenda.contactos.fabricas;

import pca.agenda.contactos.controladores.CContacto;
import pca.agenda.contactos.menus.MenuContacto;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MEmergencia;
import pca.agenda.contactos.modelos.MPersona;
import pca.agenda.contactos.vistas.VContacto;
import pca.util.menus.TMenu;

public class FabricaContactos {

	private static FabricaContactos fabrica = new FabricaContactos();

	public static FabricaContactos getFabrica() {
		return fabrica;
	}

	private FabricaContactos() {
	}

	private TContacto tContacto;

	public void aceptar(MPersona mPersona) {
		tContacto = TContacto.PERSONA;
	}
	
	public void aceptar(MEmergencia mEmergencia) {
		tContacto = TContacto.EMERGENCIA;
	}
	
	public void aceptar(MDirectorio mDirectorio) {
		tContacto = TContacto.DIRECTORIO;
		
	}

	// TODO 5: Ampliar para incorporar doble despacho de MEmergencia

	public MContacto crearModelo(TContacto tContacto) {
		return tContacto.crearModelo();
	}

	public VContacto crearVista(MContacto mContacto) {
		mContacto.despachar(this);
		VContacto vContacto = tContacto.crearVista();
		if (vContacto != null) {
			vContacto.asociar(mContacto);
		}
		return vContacto;
	}

	public MenuContacto crearMenu(MContacto mContacto, CContacto cContacto,
			TMenu tMenu) {
		mContacto.despachar(this);
		MenuContacto menuContacto = tContacto.crearMenu(tMenu);
		if (menuContacto != null) {
			VContacto vContacto = this.crearVista(mContacto);
			menuContacto.asociar(mContacto, cContacto, vContacto);
		}
		return menuContacto;
	}
}
