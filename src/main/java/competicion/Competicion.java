package competicion;


public class Competicion implements Competicionable{
	
	private String temporada;
	private TipoEquipo tipoEquipo;
	private Categoria categoria;
	private int grupo;
	private Licencia licencia;
	private Clasificacion clasificacion;
	private Calendario calendario;

	
	public Competicion(String temporada, TipoEquipo tipoEquipo, Categoria categoria,
			int grupo, Licencia licencia, Clasificacion clasificacion, Calendario calendario) {
		
		this.temporada = temporada;
		this.tipoEquipo = tipoEquipo;
		this.categoria = categoria;
		this.grupo = grupo;
		this.licencia = licencia;
		this.clasificacion = clasificacion;
		this.calendario = calendario;
		
	}
	
	
	public Clasificacion getClasificacion() {
		return clasificacion;
	}
	@Override
	public Calendario getCalendario() {
		return calendario;
	}

	@Override
	public Licencia getLicencia() {

		return licencia;
	}

	@Override
	public int getGrupo() {

		return grupo;
	}

	@Override
	public Categoria getCategoria() {

		return categoria;
	}

	@Override
	public TipoEquipo getTipoEquipo() {

		return tipoEquipo;
	}

	@Override
	public String getTemporada() {

		return temporada;
	}


	@Override
	public Competicion getCompeticion() {

		return this;
	}


	@Override
	public int compareTo(Categorizable o) {
		// TODO Auto-generated method stub
		return this.getCategoria().compareTo(o.getCategoria());
	}

}
