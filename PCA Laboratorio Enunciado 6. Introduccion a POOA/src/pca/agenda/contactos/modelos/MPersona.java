package pca.agenda.contactos.modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pca.agenda.contactos.fabricas.FabricaContactos;

public class MPersona extends MIndividual {

	private String correo;
	private String direccion;
	private MPersona contactoAlternativo;
	private ArrayList<MPersona> alternativosDe;

	public MPersona() {
		alternativosDe = new ArrayList<MPersona>();
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public MPersona getContactoAlternativo() {
		return contactoAlternativo;
	}

	public void setContactoAlternativo(MPersona contactoAlternativo) {
		if (this.contactoAlternativo != null) {
			this.contactoAlternativo.unsetAlternativoDe(this);
		}
		contactoAlternativo.setAlternativoDe(this);
		this.contactoAlternativo = contactoAlternativo;
	}

	public void unsetContactoAlternativo() {
		if (contactoAlternativo != null) {
			contactoAlternativo.unsetAlternativoDe(this);
		}
		contactoAlternativo = null;
	}

	private void setAlternativoDe(MPersona contactoAlternativo) {
		alternativosDe.add(contactoAlternativo);
	}

	private void unsetAlternativoDe(MPersona contactoAlternativo) {
		alternativosDe.remove(contactoAlternativo);
	}

	public void borrar() {
		if (contactoAlternativo != null) {
			contactoAlternativo.unsetAlternativoDe(this);
		}
		List<MPersona> lista = (List<MPersona>) alternativosDe.clone();
		Iterator<MPersona> iterador = lista.iterator();
		while (iterador.hasNext()) {
			iterador.next().unsetContactoAlternativo();
		}
		super.borrar();
	}

	public void despachar(FabricaContactos fabrica) {
		fabrica.aceptar(this);
	}

	public MContacto copia() {
		return new MPersona();
	}
}
