package figurasgeometricas;

import java.util.Objects;
import java.util.TreeSet;

public abstract class Figuras implements Desplazable, Comparable<Figuras>{
		protected Double area = 0.0;
		protected Punto punto;
		protected TreeSet<Figuras> compararPorArea = new TreeSet<Figuras>();
		
		public Figuras(Punto punto) {
			this.punto = punto;
		}
		
		public Punto getPunto() {
			return punto;
		}

		public void setPunto(Punto punto) {
			this.punto = punto;
		}

		public void agregarAreas(Figuras figura) {
			this.compararPorArea.add(figura);
		}

		public TreeSet<Figuras> posicionarAreas(){
			return this.compararPorArea;
		}
		
		public abstract Double getArea();

	@Override
	public void desplazar(Double deltaX, Double deltaY) {
		this.punto.desplazar(deltaX, deltaY);

	}

	@Override
	public int hashCode() {
		return Objects.hash(area);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figuras other = (Figuras) obj;
		return Objects.equals(area, other.area);
	}

	@Override
	public int compareTo(Figuras otra) {
		return this.area.compareTo(otra.area);
	}

	
	
}
