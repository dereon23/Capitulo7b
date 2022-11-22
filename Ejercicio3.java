package Capitulo7b;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int[][] tabla=new int[4][5];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				tabla[i][j]=(int)(Math.random()*900)+100;
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
					System.out.printf("%6d",tabla[i][j]);
				}
				System.out.printf("%6d\n",suma);
				sumatotal+=suma;
			}else {
				for(int j=0;j<5;j++) {
					suma=0;
					for(int k=0;k<4;k++) {
						suma+=tabla[k][j];
					}
					System.out.printf("%6d",suma);
				}
				System.out.printf("%6d",sumatotal);
			}
		}
		
		
		
		
	}

}
