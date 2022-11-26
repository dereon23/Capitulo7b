package Capitulo7b;
import java.util.*;

public class Ejercicio10 {
	
	public static void main(String[] args) {
	
		String[][] tablero=new String[3][3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=" ";
			}
		}
		int colselect=0; int filselect=0; boolean continuar=true; boolean jugador1=true;;
		
		while(continuar) {
			
			do{
				
			if(jugador1) {
				System.out.println("Juega jugador 1:\n");
				jugador1=false;
			}else {
				System.out.println("Juega jugador 2:\n");
				jugador1=true;
			}
			
			System.out.println("     1     2     3");
			for(int i=0;i<3;i++) {
				System.out.printf((i+1)+"    %s  |  %s  |  %s", tablero[i][0], tablero[i][1], tablero[i][2]);
				if(i<2) {
					System.out.print("\n   _________________\n");
				}
			}
			
			System.out.print("\n\nSelecciona columna: ");
			colselect=s.nextInt()-1;
			System.out.print("Selecciona fila: ");
			filselect=s.nextInt()-1;
			
			}while(!tablero[filselect][colselect].equals(" "));
			if(jugador1) {
				tablero[filselect][colselect]="O";
			}else {
				tablero[filselect][colselect]="X";
			}
			
			for(int i=0;i<3;i++) {
				if(tablero[0][i].equals(tablero[1][i])&&tablero[0][i].equals(tablero[2][i])&&!tablero[0][i].equals(" ")) {
					continuar=false;
					if(tablero[0][i].equals("X")) {
						System.out.println("\n\nGana el Jugador 1!");
					}else {
						System.out.println("\n\nGana el Jugador 2!");
					}
					System.out.println("Pulse cualquier tecla");
					s.nextInt();
				}
				if(tablero[i][0].equals(tablero[i][1])&&tablero[i][0].equals(tablero[i][2])&&!tablero[i][0].equals(" ")) {
					continuar=false;
					if(tablero[i][0].equals("X")) {
						System.out.println("\n\nGana el Jugador 1!");
					}else {
						System.out.println("\n\nGana el Jugador 2!");
					}
					System.out.println("Pulse cualquier tecla");
					s.nextInt();
				}
				if(tablero[0][0].equals(tablero[1][1])&&tablero[0][0].equals(tablero[2][2])&&!tablero[0][0].equals(" ")) {
					continuar=false;
					System.out.println("     1     2     3");
					for(int j=0;j<3;j++) {
						System.out.printf((j+1)+"    %s  |  %s  |  %s", tablero[j][0], tablero[j][1], tablero[j][2]);
						if(j<2) {
							System.out.print("\n   _________________\n");
						}
					}
					if(tablero[0][0].equals("X")) {
						System.out.println("\n\nGana el Jugador 1!");
					}else {
						System.out.println("\n\nGana el Jugador 2!");
					}
					System.out.println("Pulse cualquier tecla");
					s.nextInt();
				}
				if(tablero[1][1].equals(tablero[0][2])&&tablero[1][1].equals(tablero[2][0])&&!tablero[1][1].equals(" ")) {
					continuar=false;
					if(tablero[1][1].equals("X")) {
						System.out.println("\n\nGana el Jugador 1!");
					}else {
						System.out.println("\n\nGana el Jugador 2!");
					}
					System.out.println("Pulse cualquier tecla");
					s.nextInt();
				}
				
		        System.out.println("\u001b[2J");

			}
			
		}
		
	}
	
}
