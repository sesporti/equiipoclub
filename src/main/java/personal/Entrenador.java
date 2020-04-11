package personal;

import java.util.ArrayList;
import java.util.List;

import competicion.Equipo;
import competicion.Licencia;

public class Entrenador extends PersonaSueldo {

	private List<Licencia> licencias;
	private List<Equipo> equipos;
	private List<Double> sueldos;
	
	public Entrenador(String nombre, String sexo, String dni, int edad, double sueldo) {
		super(nombre, sexo, dni, edad, sueldo);
		licencias = new ArrayList<Licencia>();
		equipos = new ArrayList<>();
		sueldos = new ArrayList<>();
		sueldos.add(sueldo);
	}
	
	public List<Licencia> getLicencias() {
		return licencias;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public List<Double> getSueldos() {
		return sueldos;
	}
	
	public void agregarLicencia (Licencia licencia) {
		getLicencias().add(licencia);
	}
	
	public void eliminarLicencia (Licencia licencia) {
		getLicencias().remove(licencia);
	}
	
	public void agregarEquipo (Equipo equipo) {
		getEquipos().add(equipo);
	}
	
	public void eliminarEquipo (Equipo equipo) {
		getEquipos().remove(equipo);
	}

	@Override
	public double calcularSueldo() {
		double total = 0;
		for ( Double s : getSueldos()) {
			total += s.doubleValue();
		}
		return total;
	}

	@Override
	public void agregarSueldo(double sueldo) {
		getSueldos().add(sueldo);
		
	}

	@Override
	public void eliminarSueldo(double sueldo) {
		getSueldos().remove(sueldo);
		
	}

	@Override
	public String toString() {
		return String.format("Datos Identificativos: %s, Licencias: %s, Equipos: %s, Sueldo Total= %s €,",
				super.toString(), getLicencias(), getEquipos(), calcularSueldo());
	}

	
	
	
}
