package figurasgeometricas;


import java.util.Objects;
import java.util.TreeSet;

public class Segmento implements Desplazable, EsParalelo, Comparable<Segmento> {
	private Punto punto;
	private Punto puntoDos;
	private Double longitud = 0.0;
	protected TreeSet<Segmento> compararPorLongitud = new TreeSet<Segmento>();
	
	
	public Segmento(Punto punto, Punto puntoDos) {
		this.punto = punto;
		this.puntoDos = puntoDos;
	}

	public void agregarLongitudes(Segmento segmento) {
		this.compararPorLongitud.add(segmento);
	}
	
	
	public TreeSet<Segmento> posicionarLongitudes(){
		return this.compararPorLongitud;
	}


	@Override
	public void desplazar(Double deltaX, Double deltaY) {
		this.punto.desplazar(deltaX, deltaY);
		this.puntoDos.desplazar(deltaX, deltaY);
	}

	public Double getLongitud() {
		this.longitud = Math.sqrt((Math.pow(this.puntoDos.getX() - this.punto.getX(), 2) + 
				(Math.pow(this.puntoDos.getY() - this.punto.getY(),2))));
		return this.longitud;
		
	}

	@Override
	public Boolean esParaleloAY() {
		if(this.punto.getY() == null && this.puntoDos.getY() == null) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean esParaleloAX() {
		if(this.punto.getX() == null && this.puntoDos.getX() == null) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean esParaleloA(Segmento otro) {
		if(comparacionDeMDeDosSegmentos(otro)) {
			return true;
		}
		return false;
	}

	private boolean comparacionDeMDeDosSegmentos(Segmento otro) {
		return (this.puntoDos.getY() - this.punto.getY()) / (this.puntoDos.getX() - this.punto.getX()) ==
			(otro.puntoDos.getY() - otro.punto.getY()) / (otro.puntoDos.getX() - otro.punto.getX());
	}

	
	@Override
	public int compareTo(Segmento otro) {
		return this.longitud.compareTo(otro.longitud);
	}

	@Override
	public int hashCode() {
		return Objects.hash(longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segmento other = (Segmento) obj;
		return Objects.equals(longitud, other.longitud);
	}


	
	
	
}
