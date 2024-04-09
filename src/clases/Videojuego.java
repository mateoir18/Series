package clases;

public class Videojuego implements Entregable {
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public Videojuego() {
		horas = 10;
		entregado = false;
	}
	
	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
	}
	
	public Videojuego(String titulo, int horas, String genero, String compania) {
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
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

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compania=" + compania + "]";
	}
	
	

}
