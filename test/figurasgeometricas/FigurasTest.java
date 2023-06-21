package figurasgeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigurasTest {

	@Test
	public void queSeCreeElCirculo() {
		Punto pc = new Punto(2.0, 1.0);
		Circulo c = new Circulo(pc, 4.0);
		assertNotNull(c);
	}

	@Test
	public void queSeCalculeElAreaDelCirculo() {
	Punto pc = new Punto(2.0, 1.0);
	Circulo c = new Circulo(pc, 4.0);
	Double valorEsperado = 50.26;
	Double valorObtenido = c.getArea();
	assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queElCirculoSePuedaDesplazar() {
		Punto pc = new Punto(2.0, 1.0);
		Circulo c= new Circulo(pc, 4.0);
		Double deltaX = 1.0;
		Double deltaY = 0.0;
		c.desplazar(deltaX, deltaY);
		assertTrue(pc.getX().equals(3.0));
		assertTrue(pc.getY().equals(1.0));
	}
	
	@Test
	public void queCompareLasAreasDeLosCirculos() {
		Punto pc = new Punto(2.0, 1.0);
		
		Figuras c= new Circulo(pc, 4.0);
		Figuras c2= new Circulo(pc, 6.0);
		Figuras c3= new Circulo(pc, 8.0);
		
		c.agregarAreas(c);
		c.agregarAreas(c2);
		c.agregarAreas(c3);
		
		assertEquals(c.compararPorArea.first(), c);
		assertEquals(c.compararPorArea.last(), c3);
		
	}
	
	@Test
	public void queSeCreeElCuadrado() {
	Punto pc = new Punto(2.0, 1.0);	
	Cuadrado c = new Cuadrado(pc, 4.0);
	assertNotNull(c);
	}
	
	@Test
	public void queSeCalculeElAreaDelCuadrado() {
		Punto pc = new Punto(2.0, 1.0);	
		Cuadrado c = new Cuadrado(pc, 4.0);
		Double valorEsperado = 16.0;
		Double valorObtenido = c.getArea();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queElCuadradoSePuedaDesplazar() {
		Punto pc = new Punto(4.0, 2.0);	
		Cuadrado c = new Cuadrado(pc, 4.0);
		Double deltaX = 2.0;
		Double deltaY = 1.0;
		c.desplazar(deltaX, deltaY);
		assertTrue(pc.getX().equals(6.0));
		assertTrue(pc.getY().equals(3.0));
	}
	
	@Test
	public void queCompareLasAreasDeUnCuadradoYDevuelvaSuPosicion() {
		Punto pc = new Punto(4.0, 2.0);	
		
		Figuras c = new Cuadrado(pc, 4.0);
		Figuras c2 = new Cuadrado(pc, 6.0);
		Figuras c3 = new Cuadrado(pc, 8.0);
		
		c.agregarAreas(c);
		c.agregarAreas(c2);
		c.agregarAreas(c3);
		
		assertEquals(c.compararPorArea.first(), c);
		assertEquals(c.compararPorArea.last(), c3);
	
	}
	
	
}
