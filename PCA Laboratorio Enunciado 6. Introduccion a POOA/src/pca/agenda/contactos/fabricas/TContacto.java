package pca.agenda.contactos.fabricas;

import pca.agenda.contactos.menus.MenuAbrirDirectorio;
import pca.agenda.contactos.menus.MenuAbrirEmergencia;
import pca.agenda.contactos.menus.MenuAbrirPersona;
import pca.agenda.contactos.menus.MenuAnyadirContacto;
import pca.agenda.contactos.menus.MenuContacto;
import pca.agenda.contactos.menus.MenuEditarDirectorio;
import pca.agenda.contactos.menus.MenuEditarEmergencia;
import pca.agenda.contactos.menus.MenuEditarPersona;
import pca.agenda.contactos.menus.MenuSeleccionarDirectorio;
import pca.agenda.contactos.menus.MenuSeleccionarPersona;
import pca.agenda.contactos.menus.MenuVerContacto;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MEmergencia;
import pca.agenda.contactos.modelos.MPersona;
import pca.agenda.contactos.vistas.VContacto;
import pca.agenda.contactos.vistas.VDirectorio;
import pca.agenda.contactos.vistas.VEmergencia;
import pca.agenda.contactos.vistas.VPersona;
import pca.util.Nombrable;
import pca.util.menus.TMenu;

// TODO 4: Ampliar para incorporar modelo, vista y menus de la emergencia
public enum TContacto implements Nombrable {

	CONTACTO("contacto"),
	INDIVIDUAL("individual"),
	PERSONA("persona"),
	EMERGENCIA("emergencia"),
	DIRECTORIO("directorio");

	private String nombre;
	private MContacto mContacto;
	private VContacto vContacto;
	private MEmergencia mEmergencia;
	private VEmergencia vEmergencia;
	private MenuContacto[] menusContacto;
	private MenuContacto[] menusEmergencia;

	private TContacto(String nombre) {
		this.nombre = nombre;
		mEmergencia = new MEmergencia();
		vEmergencia = new VEmergencia();
		if (nombre.equals("persona")) {
			mContacto = new MPersona();
			vContacto = new VPersona();
			menusContacto = new MenuContacto[] {
				new MenuAbrirPersona(),
				new MenuEditarPersona(),
				new MenuSeleccionarPersona(),
				null,
				new MenuVerContacto(),
				new MenuAbrirEmergencia(),
				new MenuEditarEmergencia()
			};
		} else if (nombre.equals("directorio")) {
			mContacto = new MDirectorio();
			vContacto = new VDirectorio();
			menusContacto = new MenuContacto[] {
				new MenuAbrirDirectorio(),
				new MenuEditarDirectorio(),
				new MenuSeleccionarDirectorio(),
				new MenuAnyadirContacto(),
				new MenuVerContacto(),
				new MenuAbrirEmergencia(),
				new MenuEditarEmergencia()
			};
		}
	}

	public String getNombre() {
		return nombre;
	}

	MContacto crearModelo() {
		if (mContacto == null) {
			return null;
		} else {
			return mContacto.copia();
		}
	}

	VContacto crearVista() {
		if (vContacto == null) {
			return null;
		} else {
			return vContacto.copia();
		}
	}

	MenuContacto crearMenu(TMenu tMenu) {
		MenuContacto menu = menusContacto[tMenu.ordinal()];
		if (menu == null) {
			return null;
		} else {
			return menu.copia();
		}
	}
}
