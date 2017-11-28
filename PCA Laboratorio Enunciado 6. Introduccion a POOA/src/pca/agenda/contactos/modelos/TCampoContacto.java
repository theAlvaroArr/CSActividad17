package pca.agenda.contactos.modelos;

import pca.util.Nombrable;

public enum TCampoContacto implements Nombrable {

	NOMBRE("nombre"),
	TELEFONO("telefono"),
	DIRECCION("direccion"),
	CORREO("correo"),
	CONTACTO_ALTERNATIVO("contacto alternativo");
	
	private String nombre;

	private TCampoContacto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}

