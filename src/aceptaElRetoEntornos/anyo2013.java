package aceptaElRetoEntornos;

import java.util.Scanner;

public class anyo2013 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Variables serie=diferencia entre año origen y anyo hacia atras; diferencia = diferencia entre anyo origen y proxima serie;
		
		
		int casos = tec.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int serie=0;
			int diferencia=0;
			boolean seguir, aux;
			//Pedimos el anyo y lo copiamos en otra variable que usaremos luego para reiniciar el anyo;
			int anyo = tec.nextInt();
			int primerAnyo = anyo;
			
			//Damos a seguir el valor de la cadena repetidos o sin repetir (true o false) para que haga bucle hasta que sean diferentes
			seguir = numeroRepetido(anyo);
			aux= seguir;
			
			 while ( seguir == aux ) {
					aux= numeroRepetido(anyo);
					
					//Mientras sean igual, significa que la serie++, restamos un anyo para probar con el anyo anterior.
					if(seguir==aux) {
						anyo--;
						serie++;
					}
				}
			
			 //Reiniciamos los anyos al primero y el boolean seguir al valor del principio(true o false)
			 anyo = primerAnyo;
			 seguir = numeroRepetido(anyo);
			 aux= seguir;			 
				
			
			 //Busqueda de proxima cadena hasta que sea diferente, guardamos esta diferencia en la variable "diferencia"
			 
			 while(seguir==aux) {
				aux= numeroRepetido(anyo);
				if(seguir==aux) {
					anyo++;
					diferencia++;
				}
				 
			 }
						
			 //Mostramos resultados, el anyo de inicio - diferencia hasta la anterior serie y el valor de serie más la diferencia nos dará la longitud de la serie.
			 //sumo +1 y resto -1 para que de el valor correspondiente.
			 
				System.out.println( (primerAnyo - serie +1) + " " + (serie + diferencia -1));

				
			}
			
		}
		

	
	public static boolean numeroRepetido(int anyoNum){
		//Metodo que devuelve true si tiene un numero repetido. False si no tiene repetido.
		
		String anyo = Integer.toString(anyoNum);	
	
		//Recorrido
		for (int i = 0; i < anyo.length() ; i++) {		
			//Busqueda
				for (int j = i+1; j < anyo.length(); j++) {
					if(anyo.charAt(i) == anyo.charAt(j) )
						return true;
				}
		}
		
		
		return false;
	}

}


