package clases;

public class Serie implements Entregable {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		temporadas = 3;
		entregado = false;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		entregado = true;

	}

	@Override
	public void devolver() {
		entregado = false;

	}

	@Override
	public boolean isEntregado() {

		return entregado;
	}

}
