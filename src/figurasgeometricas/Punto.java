package figurasgeometricas;

import java.util.Objects;

public class Punto implements Desplazable{

	private Double x;
	private Double y;

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double distancia(Punto otro) {
		return Math.sqrt(Math.pow(otro.x - this.x,2) + Math.pow(otro.y - this.y, 2));
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}

	@Override
	public void desplazar(Double deltaX, Double deltaY) {
			this.setX(this.x + deltaX); 
			this.setY(this.y + deltaY);
		
	}
	
}
