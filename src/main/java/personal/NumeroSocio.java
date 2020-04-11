package personal;

public class NumeroSocio {
	
	private static int ultimoNumero = 0;
	private int numero;
	
	public NumeroSocio() {
		numero = ultimoNumero++;
		ultimoNumero = numero;
	}

	public static int getUltimoNumero() {
		return ultimoNumero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "NumeroSocio = " + getNumero();
	}

	
}
