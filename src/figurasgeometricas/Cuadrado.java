package figurasgeometricas;

public class Cuadrado extends Figuras{
	private Double lado;
	

	public Cuadrado(Punto punto, Double lado) {
		super(punto);
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public Double getArea() {
		this.area = Math.pow(this.lado, 2);
		return this.area;
	}

	

	

	
	
}
