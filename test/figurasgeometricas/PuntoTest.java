package figurasgeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void queSePuedaGenerarUnValorXeY() {
	Punto p = new Punto(4.0, 6.0);
	assertNotNull(p);
	}

	@Test
	public void queSePuedaCalcularLaDistanciaDeDosPuntos() {
	Double valorEsperado = 1.41;
	Punto p = new Punto(1.0, 1.0);
	Punto p2 = new Punto(2.0, 2.0);
	Double distanciaObtenida = p.distancia(p2);
	assertEquals(valorEsperado, distanciaObtenida, 0.01);
	}
	
	@Test
	public void queSePuedaDesplazarHaciaLaDerecha() {
		Double deltaX = 1.0;
		Double deltaY = 0.0;
		Punto p = new Punto(1.0, 1.0);
		p.desplazar(deltaX, deltaY);
		assertTrue(p.getX().equals(2.0));
		assertTrue(p.getY().equals(1.0));
		
		Punto p2 = new Punto(2.0, 1.0);
		assertEquals(p, p2);
	}
	
}
