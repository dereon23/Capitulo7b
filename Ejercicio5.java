package Capitulo7b;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int[][] tabla=new int[6][10];
		
		
		int maxx=0; int maxy=0; int minx=0; int miny=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				tabla[i][j]=(int)(Math.random()*1001);
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
