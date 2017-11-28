package pca.agenda.contactos.controladores;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MIndividual;
import pca.agenda.contactos.modelos.MPersona;
import pca.agenda.contactos.modelos.TCampoContacto;
import pca.util.dialogos.DAceptar;
import pca.util.dialogos.DEntrada;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAnyadir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

class CEditarContacto extends CContacto {

	CEditarContacto(MContacto mContacto) {
		super(mContacto);
		menuContacto = fabricaContactos.crearMenu(mContacto, this,
				TMenu.EDITAR);
	}

	public void controlar() {
		if (mContacto.getNombre() == null) {
			this.auditar(new OEditar(TCampoContacto.NOMBRE));
		}
		menuContacto.ejecutar();
		// despachos
	}

	void setContactoAlternativo(MPersona mPersona) {
		if (mPersona != null) {
			if (mPersona.eres(mContacto)) {
				DAceptar dError = fabricaDialogos.crearDAceptar("ERROR:",
						"El contacto alternativo de '" +
						mContacto.getNombre() +
						"' no puede ser el mismo!!!!");
				dError.ejecutar();
			} else {
				((MPersona) mContacto).setContactoAlternativo(mPersona);
			}
		}
	}

	public void auditar(OEditar oEditar) {
		switch ((TCampoContacto) oEditar.getTipo()) {
			case CONTACTO_ALTERNATIVO:
				CSeleccionarContacto cSeleccionarContacto =
						new CSeleccionarContacto(this);
				cSeleccionarContacto.controlar();
				break;
			case NOMBRE:
				boolean salir = false;
				while (!salir) {
					DEntrada dValor = fabricaDialogos.crearDEntrada(
							oEditar.getTitulo() + ":",
							"Introduzca el nuevo valor? ");
					dValor.ejecutar();
					String nombre = dValor.getString();
					String anterior = mContacto.getNombre();
					if (nombre == null && anterior != null) {
						salir = true;
					} else if (nombre == null || nombre.equals("")) {
						DAceptar dVacio = fabricaDialogos.crearDAceptar(
								"ERROR:", "El nombre no puede estar vacio!!!!");
						dVacio.ejecutar();
					} else if (!nombre.equals(anterior) &&
							mContacto.getMDirectorio() != null &&
							mContacto.getMDirectorio().incluye(nombre)) {
						DAceptar dEsta = fabricaDialogos.crearDAceptar(
								"ERROR:", "El contacto '" + nombre +
								"' ya esta en el directorio '" +
								mContacto.getMDirectorio().getNombre() +
								"'!!!!");
						dEsta.ejecutar();
					} else {
						mContacto.setNombre(nombre);
						salir = true;
					}
				}
				break;
			default:
				DEntrada dValor = fabricaDialogos.crearDEntrada(
						oEditar.getTitulo() + ":",
						"Introduzca el nuevo valor? ");
				dValor.ejecutar();
				String valor = dValor.getString();
				if (valor != null) {
					switch ((TCampoContacto) oEditar.getTipo()) {
						case TELEFONO:
							((MIndividual) mContacto).setTelefono(valor);
							break;
						case DIRECCION:
							((MPersona) mContacto).setDireccion(valor);
							break;
						case CORREO:
							((MPersona) mContacto).setCorreo(valor);
							break;
					}
				}
				break;
		}
	}

	public void auditar(OBorrar oBorrar) {
		if (((MPersona) mContacto).getContactoAlternativo() == null) {
			DAceptar dNoExiste = fabricaDialogos.crearDAceptar("ERROR:",
					"No existe persona de contacto alternativa!!!!");
			dNoExiste.ejecutar();
		} else {
			((MPersona) mContacto).unsetContactoAlternativo();
		}
	}

	public void auditar(OAnyadir oAnyadir) {
		CAnyadirContacto controlador = new CAnyadirContacto(
				(MDirectorio) mContacto);
		controlador.controlar();
	}
}
