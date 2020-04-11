package personal;

public class Administrativo extends PersonaSueldo {

		
	public Administrativo(String nombre, String sexo, String dni, int edad, double sueldo) {
		
		super(nombre, sexo, dni, edad, sueldo);
		
	}

	@Override
	public double calcularSueldo() {

		return getSueldo();
	}

	@Override
	public void agregarSueldo(double sueldo) {

		setSueldo(sueldo);
	}

	@Override
	public void eliminarSueldo(double sueldo) {
		
		setSueldo(0);
	}

	
	
}
