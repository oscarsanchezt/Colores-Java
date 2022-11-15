package colores;
public class Colores {

	public static void main(String[] args) {
		//Codigo de colores
		String Colores="\033[37m Colores: ";
		String C = Colores;
		String rojo="\033[31m"; 
		String azul="\033[34m";
		String verde="\033[32m";
		String morado="\033[35m";
		String cyan="\033[36m";
		String amarillo ="\033[33m";
		//Salida de colores
		System.out.println("Colores java: ");
		//Print
		System.out.println(C+rojo+"Rojo");
		System.out.println(C+azul+"Azul");
		System.out.println(C+verde+"Verde");
		System.out.println(C+morado+"Morado");
		System.out.println(C+cyan+"Cyan");
		System.out.println(C+amarillo+"Amarillo");
	}

}
