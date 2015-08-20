import java.util.ArrayList;


/**
 * @author Christopher Chiroy, Boris Cifuentes
 * @category Hoja de Trabajo 2
 * @param <E>
 */

public class CtrlStackArrey<E> extends AbstractPilas<E>{
	private ArrayList<E> list;
	private int posicion;
	
	/**
	 * se est� creando un array y la variabale posicion en 0
	 */
	public CtrlStackArrey(){
		list = new ArrayList<E>();
		posicion = 0;
	}
	@Override
	/**
	 *podemos limpiar la pila con este metodo
	 *pre: lista puede o no contener datos
	 *post: Lista vacia
	 */
	public void empty() {
		// TODO Auto-generated method stub
		list.clear();
	}


	@Override
	/**
	 *puede colocar en la pila un valor determinado, mandarlo hacia abajo
	 *pre: recibe dato
	 *post: agrega dato a la lista
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		list.add(x);
		posicion++;
	}

	@Override
	/**
	 *puede sacar un elemento de la pila, lo manda haci arriba
	 *pre: retira el ultimo valor ingresado de la lista
	 *post: regresa el valor retirado de la lista
	 */
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		E n =  list.get(posicion-1);
		list.remove(posicion-1);
		posicion-=1;
		return n;
	}

	@Override
	/**
	 *este provee el tama�o de la pila
	 *pre: cuanta cantidad de datos en la lista
	 *post: Devuelve cantidad de datos en la lista
	 */
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	/**
	 *se puede verficar el dato de hasta arriba
	 *pre: lee el ultimo valor ingresado
	 *post: devuelve el ultimo valor ingresado
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		E n =  list.get(posicion-1);
		return n;
	}

}
