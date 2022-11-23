package Capitulo7b;

public class Ejercicio6 {

public static void main(String[] args) {
		
		int[][] tabla=new int[6][10];
		
		boolean igual;
		int maxx=0; int maxy=0; int minx=0; int miny=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				do {
					igual=false;
					tabla[i][j]=(int)(Math.random()*1001);
					for(int k=0; k<=i;k++) {
						for(int l=0; l<=j;l++) {
							if(tabla[k][l]==tabla[i][j]&&!(k==i&&l==j)){
								igual=true;
							}
						}
					}
				}while(igual);
				if(tabla[i][j]>tabla[maxx][maxy]) {
					maxx=i; maxy=j;
				}
				if(tabla[i][j]<tabla[minx][miny]) {
					minx=i; miny=j;
				}
			}
		}
		
		
		System.out.print("     ");
		for(int i=0;i<10;i++) {
			System.out.printf("%5d",i);
		}
		System.out.println();
		
		for(int i=0;i<6;i++) {
			System.out.printf("%5d",i);
			for(int j=0;j<10;j++) {
				System.out.printf("%5d",tabla[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("\n\nEl maximo esta en: ("+maxx+","+ maxy+")");
		System.out.print("\nEl minimo esta en: ("+minx+","+ miny+")");

	}
	
}
