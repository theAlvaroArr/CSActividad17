package pca.agenda.contactos.modelos;

public abstract class MIndividual extends MContacto {

	protected String telefono;

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
