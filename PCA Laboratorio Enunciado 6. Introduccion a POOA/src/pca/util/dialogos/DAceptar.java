package pca.util.dialogos;

public class DAceptar extends Dialogo {

	DAceptar(String titulo, String mensaje) {
		super(titulo, mensaje);
	}

	public void ejecutar() {
		super.ejecutar();
		String enter = gestorIO.leerString(mensaje + " <Pulse ENTER>");
	}
}
