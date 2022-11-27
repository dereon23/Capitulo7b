package Capitulo7b;

public class Ejercicio13 {
	
	public static void main(String[] args) {
	int[][] tabla=new int[4][13];
	int suma; int min; int max;
	for(int i=0;i<4;i++) {
		suma=0;
		min=210;
		max=140;
		for(int j=0;j<10;j++) {
			tabla[i][j]=(int)(Math.random()*71+140);
			suma+=tabla[i][j];
			if(tabla[i][j]>max) {
				max=tabla[i][j];
			}
			if(tabla[i][j]<min) {
				min=tabla[i][j];
			}
		}
		tabla[i][10]=suma/10;
		tabla[i][11]=min;
		tabla[i][12]=max;
	}
	
	System.out.printf("%65s", "MED MIN MAX");
	for(int i=0;i<4;i++) {
		switch(i) {
			case 0:
				System.out.printf("\n%-10s ","Espana:");
				break;
			case 1:
				System.out.printf("\n%-10s ","Rusia:");
				break;
			case 2:
				System.out.printf("\n%-10s ", "Japon:");
				break;
			case 3:
				System.out.printf("\n%-10s ","Australia:");
				break;
			default: ;
		}
		for(int j=0;j<13;j++) {
			if(j==10) {
				System.out.print(" |");
			}
			System.out.printf("%4d", tabla[i][j]);
		}
	}
	
	}
	
}
