package pca.util.menus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pca.util.GestorIO;
import pca.util.Intervalo;
import pca.util.menus.opciones.OSalir;
import pca.util.menus.opciones.Opcion;
import pca.util.vistas.Vista;

public abstract class Menu {

	protected Auditor auditor;
	protected Vista vista;
	private String titulo;
	private List<Opcion> opciones = new ArrayList<Opcion>();
	private OSalir oSalir;
	private TModoMenu modo;
	private boolean salida = false;
	private static GestorIO gestorIO = GestorIO.getGestorIO();

	protected Menu(String titulo, TModoMenu modo) {
		this.titulo = titulo;
		this.modo = modo;
		if (this.modo != TModoMenu.ALTERNATIVO) {
			oSalir = new OSalir(this);
		}
	}

	protected void asociar(Auditor auditor, Vista vista) {
		this.auditor = auditor;
		this.vista = vista;
	}

	protected String getTitulo() {
		return titulo;
	}

	public void ejecutar() {
		this.configurar();
		if (this.modo != TModoMenu.ALTERNATIVO) {
			this.anyadir(oSalir);
		}
		do {
			if (vista != null) {
				vista.mostrar();
			}
			Intervalo iOpciones = new Intervalo(1, opciones.size());
			gestorIO.escribirLinea();
			gestorIO.escribirLinea(this.getTitulo());
			int i = 1;
			Iterator<Opcion> iterador = opciones.iterator();
			while (iterador.hasNext()) {
				gestorIO.escribirLinea("[" + i + "] " +
						iterador.next().getTitulo());
				i++;
			}
			int opcion;
			do {
				opcion = gestorIO.leerInt("Opcion? ");
			} while (!iOpciones.incluye(opcion));
			opciones.get(opcion - 1).despachar(auditor);
			if (modo == TModoMenu.DINAMICO) {
				opciones.clear();
				this.configurar();
				this.anyadir(oSalir);
			}
		} while (!salida &&
				(modo == TModoMenu.ITERATIVO || modo == TModoMenu.DINAMICO));
	}

	protected void anyadir(Opcion opcion) {
		opciones.add(opcion);
	}

	public void salir() {
		salida = true;
	}

	public void reentrar() {
		salida = false;
	}

	protected abstract void configurar();
}
