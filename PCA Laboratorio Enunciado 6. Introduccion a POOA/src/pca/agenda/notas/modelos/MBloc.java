package pca.agenda.notas.modelos;

import java.util.ArrayList;
import java.util.List;

public class MBloc {

	private String nombre;
	private List<MNota> mNotas;

	public MBloc() {
		mNotas = new ArrayList<MNota>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public List<MNota> getMNotas() {
		return mNotas;
	}

	public MNota getMNota(int posicion) {
		return mNotas.get(posicion);
	}

	public void anyadir(MNota mNota) {
		mNotas.add(mNota);
	}

	void borrar(MNota mNota) {
		mNotas.remove(mNota);
	}

	public MBloc copia(){
		return new MBloc();
	}
}
