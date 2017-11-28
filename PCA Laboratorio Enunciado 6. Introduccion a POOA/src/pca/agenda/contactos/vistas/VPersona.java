package pca.agenda.contactos.vistas;

import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MPersona;

public class VPersona extends VIndividual {

	private MPersona mPersona;

	public VPersona() {
		this.setTextos("PERSONA: ", "Persona: ",
				"......................................");
	}

	public void asociar(MContacto mContacto) {
		super.asociar(mContacto);
		this.mPersona = (MPersona) mContacto;
	}

	private String getCampo(MPersona contactoAlternativo) {
		String campo;
		if (contactoAlternativo == null) {
			campo = "<vacio>";
		} else {
			campo = contactoAlternativo.getNombre();
		}
		return campo;
	}

	public void mostrar() {
		super.mostrar();
		gestorIO.escribirLinea("Correo: " +
				this.getCampo(mPersona.getCorreo()));
		gestorIO.escribirLinea("Direccion: " +
				this.getCampo(mPersona.getDireccion()));
		gestorIO.escribirLinea("Contacto alternativo: " +
				this.getCampo(mPersona.getContactoAlternativo()));
	}

	public VContacto copia (){
		return new VPersona();
	}
}
