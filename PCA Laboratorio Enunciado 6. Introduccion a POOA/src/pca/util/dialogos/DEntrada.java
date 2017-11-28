package pca.util.dialogos;

public class DEntrada extends Dialogo {

	private String entrada;

	DEntrada(String titulo, String mensaje) {
		super(titulo, mensaje);
	}

	public void ejecutar() {
		super.ejecutar();
		entrada = gestorIO.leerString(mensaje);
	}

	public String getString() {
		return entrada;
	}

	public int getInt() {
		return Integer.parseInt(entrada);
	}
}
