import java.util.Scanner;

/**
 * @author Christopher Chiroy, Boris cifuentes
 * Hoja de Trabajo 4
 */
public class main {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese tipo de pila que desea usar\n");
		System.out.println("1. ArreyList \n2. Vector \nListas: \n	3. Simplemente Enlazada\n"
				+ "	4. Doblemente Enlazada \n	5. Circular");
		int opcion = teclado.nextInt();
		
		CtrlCalculadora calcu = new CtrlCalculadora(opcion);
		
			calcu.readFile("datos.txt");
		try {
			System.out.println(""+calcu.calcular());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al hacer la operacion");
		}
	}

}
