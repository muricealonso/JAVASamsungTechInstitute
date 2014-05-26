import static org.junit.Assert.*;

import org.junit.Test;



public class TestVehiculos {

	@Test
	public void testCoche() {
		Coche coche = new Coche("AAAA", "rojo", Coche.Categoria.B);
		
		assertEquals("AAAA", coche.getId());
		assertEquals("rojo", coche.getDescripcion());
		assertEquals(72, coche.precio(6), 0.0001);
	}

	@Test
	
	public void testCocheIdVacio(){
		
		try{
		Coche coche = new Coche("", "rojo", Coche.Categoria.B);
		}catch (RuntimeException e){
		}
	}
		
	
	
	@Test
	public void testMoto(){
		Moto moto = new Moto("AAAA", "rojo");
		assertEquals("AAAA", moto.getId());
		assertEquals("rojo", moto.getDescripcion());
		assertEquals(70, moto.precio(10), 0.0001);
		
		
	}
	
	public void testMotoDescripcionVacio(){
		try{
		Moto moto = new Moto("AAAA", "");
		}catch (RuntimeException e){
		}
	}
		
	
	@Test
	public void testBici(){
		Bici bici = new Bici ("AAAA", "rojo");
		assertEquals("AAAA", bici.getId());
		assertEquals("rojo", bici.getDescripcion());
		assertEquals(13, bici.precio(5),0.0001);
		
		
	}
}
