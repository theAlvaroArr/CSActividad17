package pca.agenda.contactos.modelos;

import pca.agenda.contactos.fabricas.FabricaContactos;

public abstract class MContacto {

	protected String nombre;
	protected MDirectorio mDirectorio;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	void setMDirectorio(MDirectorio mDirectorio) {
		this.mDirectorio = mDirectorio;
	}

	public MDirectorio getMDirectorio() {
		return mDirectorio;
	}

	public void borrar() {
		mDirectorio.borrar(this);
	}

	public boolean eres(MContacto mContacto) {
		return nombre.equals(mContacto.getNombre()) &&
				((mDirectorio == null && mContacto.getMDirectorio() == null) ||
				 ((mDirectorio != null && mContacto.getMDirectorio() != null) &&
				  mDirectorio.eres(mContacto.getMDirectorio())));
	}

	public abstract void despachar(FabricaContactos fabrica);

	public abstract MContacto copia();
}
