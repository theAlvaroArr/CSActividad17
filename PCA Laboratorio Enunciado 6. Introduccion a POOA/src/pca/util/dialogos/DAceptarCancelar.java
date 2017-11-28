package pca.util.dialogos;

public class DAceptarCancelar extends Dialogo {

	private boolean aceptado = false;

	DAceptarCancelar(String titulo, String mensaje) {
		super(titulo, mensaje);
	}

	public void ejecutar() {
		super.ejecutar();
		String respuesta;
		do {
			respuesta = gestorIO.leerString(mensaje +
					" ¿[A]ceptar o [C]ancelar? ");
		} while (!respuesta.equalsIgnoreCase("A") &&
				 !respuesta.equalsIgnoreCase("C"));
		aceptado = respuesta.equalsIgnoreCase("A");
	}

	public boolean aceptado() {
		return aceptado;
	}
}
