package Capitulo7b;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int[][] original=new int[12][12];
		int [][] girado=new int[12][12];
		
		System.out.println("Original: ");
		for(int i=0; i<12;i++) {
			for(int j=0;j<12;j++) {
				original[i][j]=(int)(Math.random()*101);
				System.out.printf("%4d ",original[i][j]);
				girado[j][12-1-i]=original[i][j];
			}
			System.out.println();
		}
		
		System.out.println("\nNuevo: ");
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.printf("%4d ",girado[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
