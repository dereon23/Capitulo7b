package Capitulo7b;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
int[][] tabla = new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0; j<9;j++){
				tabla[i][j]=(int)(Math.random()*401+500);
				System.out.printf("%4d", tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		int i=8; int j=8; int max=500; int min=900; int suma=0;
		while(i>-1) {
			System.out.printf("%4d",tabla[i][j]);
			if(tabla[i][j]>max) {
				max=tabla[i][j];
			}
			if(tabla[i][j]<min) {
				min=tabla[i][j];
			}
			suma+=tabla[i][j];
			i--; j--;
		}
		
		System.out.println("\nEl maximo es: "+max);
		System.out.println("El minimo es: "+min);
		System.out.println("La media es: "+(suma/9));
		
	}

}
