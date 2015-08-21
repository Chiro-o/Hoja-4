import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 4
 */
public class TestStack {
	
	AbstractPilas<Double> pila1 = new CtrlStackArrey<Double>();
	AbstractPilas<Double> pila2 = new CtrlStackVector<Double>();
	AbstractPilas<Double> pila3 = new CtrlStackSimplementeElazada<Double>();
	AbstractPilas<Double> pila4 = new CtrlStackDoblementeEnlazada<Double>();
	AbstractPilas<Double> pila5 = new CtrlStackCircular<Double>();

	
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize1(){
		int n = pila1.size();
		assertEquals(0, n);
		
	}
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize2(){
		int n = pila2.size();
		assertEquals(0, n);
		
	}
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize3(){
		int n = pila3.size();
		assertEquals(0, n);
		
	}
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize4(){
		int n = pila4.size();
		assertEquals(0, n);
		
	}
	
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize5(){
		int n = pila5.size();
		assertEquals(0, n);
		
	}
	
	/**
	 * prueba pila iniciada
	 */
	@Test
	public void testIsEmpty1(){
		boolean n = pila1.isEmpty();
		assertEquals(false, n);
	}
	
	/**
	 * prueba pila iniciada
	 */
	@Test
	public void testIsEmpty2(){
		boolean n = pila2.isEmpty();
		assertEquals(false, n);
	}
	
	/**
	 * prueba pila iniciada
	 */
	@Test
	public void testIsEmpty3(){
		boolean n = pila3.isEmpty();
		assertEquals(false, n);
	}
	
	/**
	 * prueba pila iniciada
	 */
	@Test
	public void testIsEmpty4(){
		boolean n = pila4.isEmpty();
		assertEquals(false, n);
	}
	
	/**
	 * prueba pila iniciada
	 */
	@Test
	public void testIsEmpty5(){
		boolean n = pila5.isEmpty();
		assertEquals(false, n);
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush1() {
		pila1.push(2.5);
		assertEquals(true, pila1.isEmpty());
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush2() {
		pila2.push(2.5);
		assertEquals(true, pila2.isEmpty());
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush3() {
		pila3.push(2.5);
		assertEquals(true, pila3.isEmpty());
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush4() {
		pila4.push(2.5);
		assertEquals(true, pila4.isEmpty());
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush5() {
		pila5.push(2.5);
		assertEquals(true, pila5.isEmpty());
	}

}
