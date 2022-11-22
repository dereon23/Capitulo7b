package Capitulo7b;
import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[][] tabla=new int[4][5];
		
		Scanner s =new Scanner(System.in);
		System.out.println("Introduce 20 numeros:");
		for(int i=0;i<4;i++) {
			System.out.println("Fila "+(i+1)+":");
			for(int j=0;j<5;j++) {
				tabla[i][j]=s.nextInt();
			}
		}
		
		int suma;
		int sumatotal=0;
		System.out.println("Tabla:");
		for(int i=0;i<5;i++) {
			if(i<4) {
				suma=0;
				for(int j=0;j<5;j++) {
					suma+=tabla[i][j];
					System.out.printf("%4d",tabla[i][j]);
				}
				System.out.printf("%4d\n",suma);
				sumatotal+=suma;
			}else {
				for(int j=0;j<5;j++) {
					suma=0;
					for(int k=0;k<4;k++) {
						suma+=tabla[k][j];
					}
					System.out.printf("%4d",suma);
				}
				System.out.printf("%4d",sumatotal);
			}
		}
		
		
		
		
	}

}
