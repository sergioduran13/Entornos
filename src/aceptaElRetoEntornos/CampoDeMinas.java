package aceptaElRetoEntornos;

import java.util.Scanner;

public class CampoDeMinas {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);

		int columnas;
		int filas;

		do {
			columnas = tec.nextInt();
			filas = tec.nextInt();
			tec.nextLine();
			
			//Hago esto para que no entre si pone un 0.
				if(columnas==0 || filas == 0) {
					columnas=0;
					filas=0;
				}else {
				
			// Creacion de tablero sobredimensionado, para que no de error en la comprobacion.
			char tablero[][] = new char[filas+2][columnas+2];
			
			// Bucle para leer datos
			
			for (int i = 1; i < tablero.length-1; i++) {
				
				String text= tec.nextLine();
				for (int j = 1; j < tablero[i].length-1; j++) {
					tablero[i][j] = text.charAt(j-1);
				}
			}
			
			int cantidad = 0;
			
			//Una vez tenemos todos los datos en la matriz, buscamos las minas y añadimos al contador
			for (int i = 1; i < tablero.length-1; i++) {
				for (int j = 1; j < tablero[i].length-1; j++) {
					int minas = 0;
					
					if(tablero[i][j]=='-') {
						
						if(tablero[i-1][j-1]=='*')
							minas++;
						if(tablero[i-1][j]=='*')
							minas++;
						if(tablero[i-1][j+1]=='*')
							minas++;
						if(tablero[i][j+1]=='*')
							minas++;
						if(tablero[i+1][j+1]=='*')
							minas++;
						if(tablero[i+1][j]=='*')
							minas++;
						if(tablero[i+1][j-1]=='*')
							minas++;
						if(tablero[i][j-1]=='*')
							minas++;
						
						if(minas>=6)
							cantidad++;
					}
				}
			}
			
			
			System.out.println(cantidad);
				}
			
		} while (columnas != 0 || filas != 0);
		
	}

}
