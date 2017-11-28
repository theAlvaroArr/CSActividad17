package pca.util.menus;

import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OAnyadir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;
import pca.util.menus.opciones.OItem;
import pca.util.menus.opciones.OSalir;
import pca.util.menus.opciones.OSeleccionar;
import pca.util.menus.opciones.OVer;

public abstract class Auditor {

	public void auditar(OAbrir oAbrir) {
	}

	public void auditar(OAnyadir oAnyadir) {
	}

	public void auditar(OBorrar oBorrar) {
	}

	public void auditar(OItem oItem) {
	}

	public void auditar(OEditar oEditar) {
	}

	public void auditar(OSeleccionar oSeleccionar) {
	}

	public void auditar(OVer oVer) {
	}

	public void auditar(OSalir oSalir) {
	}
}

