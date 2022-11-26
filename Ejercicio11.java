package Capitulo7b;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		int[][] tabla = new int[10][10];
		
		for(int i=0;i<10;i++) {
			for(int j=0; j<10;j++){
				tabla[i][j]=(int)(Math.random()*101+200);
				System.out.printf("%4d", tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		int i=0; int j=0; int max=200; int min=300; int suma=0;
		while(i<10) {
			System.out.printf("%4d",tabla[i][j]);
			if(tabla[i][j]>max) {
				max=tabla[i][j];
			}
			if(tabla[i][j]<min) {
				min=tabla[i][j];
			}
			suma+=tabla[i][j];
			i++; j++;
		}
		
		System.out.println("\nEl maximo es: "+max);
		System.out.println("El minimo es: "+min);
		System.out.println("La media es: "+(suma/10));
	}

}
