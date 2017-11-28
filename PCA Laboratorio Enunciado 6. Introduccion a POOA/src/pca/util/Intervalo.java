package pca.util;

public class Intervalo {

	private Integer minimo;
	private Integer maximo;

	public Intervalo(Integer minimo, Integer maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Intervalo(Intervalo intervalo) {
		this(intervalo.getMinimo(), intervalo.getMaximo());
	}

	public int getMinimo() {
		return minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public Intervalo copia() {
		return new Intervalo(minimo, maximo);
	}

	public boolean incluye(Integer valor) {
		return minimo.compareTo(valor) <= 0 &&
			maximo.compareTo(valor) >= 0;
	}

	public boolean incluye(Intervalo intervalo) {
		return this.incluye(intervalo.getMinimo()) &&
			   this.incluye(intervalo.getMaximo());
	}
}

