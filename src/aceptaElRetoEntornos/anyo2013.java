package aceptaElRetoEntornos;

import java.util.Scanner;

public class anyo2013 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int casos = tec.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int anyo = tec.nextInt();
			int serie;
			int diferencia;
			
			//Busqueda de valores repetidos
			String anyoBusqueda =  Integer.toString(anyo);
			char[] arrayAnyo = new char [4];
			
			//Rellenar el array
			
			for (int j = 0; j < arrayAnyo.length; j++) {
				arrayAnyo[j] = anyoBusqueda.charAt(j+1);
			}
			
			//Busqueda de anyo repetidos:
			
			if(numeroRepetido(arrayAnyo)){			
				
			}
			
			
		}
		
	}

	
	public static boolean numeroRepetido(char[] anyo){
		//Metodo que devuelve true si tiene un numero repetido. False si no tiene repetido.
		
		boolean resultado = false;
		
		//Recorrido
		for (int i = 0; i < anyo.length && !resultado; i++) {		
			//Busqueda
				for (int j = 1; j < anyo.length && !resultado; j++) {
					if(anyo[i] == anyo[j] )
						resultado = true;
				}
		}
		
		
		return resultado;
	}

}


