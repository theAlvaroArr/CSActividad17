package pca.util.dialogos;

public class FabricaDialogos {

	private static FabricaDialogos fabrica = new FabricaDialogos();

	public static FabricaDialogos getFabrica() {
		return fabrica;
	}

	private FabricaDialogos() {
	}

	public DAceptar crearDAceptar(String titulo, String mensaje) {
		return new DAceptar(titulo, mensaje);
	}

	public DAceptarCancelar crearDAceptarCancelar(String titulo,
			String mensaje) {
		return new DAceptarCancelar(titulo, mensaje);
	}

	public DEntrada crearDEntrada(String titulo, String mensaje) {
		return new DEntrada(titulo, mensaje);
	}
}
