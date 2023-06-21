package figurasgeometricas;

public class Circulo extends Figuras{

	private Double radio;
	

	public Circulo(Punto punto, Double radio) {
		super(punto);
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getArea() {
		this.area = Math.PI * (Math.pow(this.radio, 2));
		return this.area;
	}


}
