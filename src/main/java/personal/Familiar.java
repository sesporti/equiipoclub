package personal;

import java.util.ArrayList;
import java.util.List;

public class Familiar extends Persona {
	
	private List<Jugador> jugadores;
	
	public Familiar(String nombre, String sexo, String dni, int edad) {
		super(nombre, sexo, dni, edad);
		jugadores = new ArrayList<>();
	
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public boolean agregarJugador (Jugador jugador) {
		if (!jugadores.contains(jugador)) {
			jugadores.add(jugador);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean eliminarJugador (Jugador jugador) {
		if (jugadores.contains(jugador)) {
			jugadores.remove(jugador);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return super.toString() +", Familiar de jugadores: " + getJugadores();
	}
	
	
	
	
	
}
