package figurasgeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegmentoTest {

	@Test
	public void queSeCreeElSegmento() {
		Punto p = new Punto(1.0, 0.0);
		Punto p2 = new Punto(3.0, 3.0);
		Segmento s = new Segmento(p, p2);
		assertNotNull(s);
	}

	@Test
	public void queSePuedaCalcularLaLongitudDelSegmento() {
		Punto p = new Punto(1.0, 0.0);
		Punto p2 = new Punto(3.0, 3.0);
		Segmento s = new Segmento(p, p2);
		s.getLongitud();
		Double valorEsperado = 3.60;
		Double valorObtenido = s.getLongitud();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSePuedaDesplazarElSegmento() {
		Punto p = new Punto(1.0, 0.0);
		Punto p2 = new Punto(3.0, 3.0);
		Segmento s = new Segmento(p, p2);
		
		Double deltaX = 1.0;
		Double deltaY = 1.0;
		
		s.desplazar(deltaX, deltaY);
		
		assertTrue(p.getX().equals(2.0));
		assertTrue(p.getY().equals(1.0));
		assertTrue(p2.getX().equals(4.0));
		assertTrue(p2.getY().equals(4.0));
		
	}
	
	@Test
	public void esParaleloAX() {
		Punto p = new Punto(null, 1.0);
		Punto p2 = new Punto(null, 3.0);
		Segmento s = new Segmento(p, p2);
		assertTrue(s.esParaleloAX());
	}
	
	@Test
	public void esParaleloAY() {
		Punto p = new Punto(1.0, null);
		Punto p2 = new Punto(3.0, null);
		Segmento s = new Segmento(p, p2);
		assertTrue(s.esParaleloAY());
	}
	
	@Test
	public void esParaleloAOtroSegmento() {
		Punto p = new Punto(1.0, 0.0);
		Punto p2 = new Punto(3.0, 3.0);
		Segmento s = new Segmento(p, p2);
		
		Punto p3 = new Punto(2.0, 6.0);
		Punto p4 = new Punto(4.0, 9.0);
		Segmento s2 = new Segmento(p3, p4);
		
		assertTrue(s.esParaleloA(s2));
	}
	
	@Test
	public void compararDoSegmentosSegunSuLongitud() {
		Punto p = new Punto(1.0, 0.0);
	    Punto p2 = new Punto(3.0, 3.0);
	    Segmento s = new Segmento(p, p2);

	    Punto p3 = new Punto(2.0, 6.0);
	    Punto p4 = new Punto(4.0, 9.0);
	    Segmento s2 = new Segmento(p3, p4);

	    s.agregarLongitudes(s);
	    s.agregarLongitudes(s2);

	    assertEquals(s.posicionarLongitudes().first(), s);
	    assertEquals(s.posicionarLongitudes().last(), s2);
	}
}
