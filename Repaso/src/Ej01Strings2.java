import java.util.Scanner;
public class Ej01Strings2 {

	public static void main(String[] args) {

		String palabra, letraPedida, palabraFinal;
		int cont=0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra = teclado.nextLine();


		do {
			System.out.println("Letra que quieres reemplazar");
			letraPedida = teclado.next();
		}while(letraPedida.length()>1);

		for (cont=0; cont<=2; cont++) {
			palabra = palabra.replaceFirst(letraPedida, "");
		}
		System.out.println(palabra);
	}	
}


