package competicion;

// Podia estar dentro de Licenciable
public enum Licencia {

	PROFESIONAL,
	AFICIONADO,
	JUVENIL,
	CADETE,
	INFANTIL,
	ALEVIN,
	BENJAMIN,
	PREBENJAMIN,
	DEBUTANTE,
	SINLICENCIA;
	
	public static int[] getEdadesLicencia (Licencia licencia) {
		int[] rangoEdades = new int[2];
		switch (licencia) {
		case PROFESIONAL:
			rangoEdades[0] = 17;
			rangoEdades[1] = 65;
			break;
		case AFICIONADO:
			rangoEdades[0] = 20;
			rangoEdades[1] = 100;
			break;
		case JUVENIL:
			rangoEdades[0] = 17;
			rangoEdades[1] = 19;
			break;
		case CADETE:
			rangoEdades[0] = 15;
			rangoEdades[1] = 16;
			break;
		case INFANTIL:
			rangoEdades[0] = 13;
			rangoEdades[1] = 14;
			break;
		case ALEVIN:
			rangoEdades[0] = 11;
			rangoEdades[1] = 12;
			break;		
		case BENJAMIN:
			rangoEdades[0] = 9;
			rangoEdades[1] = 10;
			break;
		case PREBENJAMIN:
			rangoEdades[0] = 7;
			rangoEdades[1] = 8;
			break;
		case DEBUTANTE:
			rangoEdades[0] = 5;
			rangoEdades[1] = 6;
			break;
		case SINLICENCIA:// para asignar a los equipos que no se sabe su Licencia ya que no puede ser null, aceptará cualquier entrenador y cualquier jugador.
			rangoEdades[0] = 0;
			rangoEdades[1] = 100;
			break;
		default:
			break;
		}
		return rangoEdades;
	}
}
