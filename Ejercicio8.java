package Capitulo7b;
import java.util.*;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		int[][] tablero=new int[8][8];
		System.out.print("Introduzca la posición del alfil: ");
		Scanner s = new Scanner(System.in);
		String posalfil=s.nextLine();
		
		System.out.println("El álfil puede moverse a las siguientes posiciones: ");
		
		int posalfilx;
		
		switch(posalfil.charAt(0)){
			case 'a':
				posalfilx=0;
				break;
			case 'b':
				posalfilx=1;
				break;
			case 'c':
				posalfilx=2;
				break;
			case 'd':
				posalfilx=3;
				break;
			case 'e':
				posalfilx=4;
				break;
			case 'f':
				posalfilx=5;
				break;
			case 'g':
				posalfilx=6;
				break;
			case 'h':
				posalfilx=7;
				break;
			default:
				System.out.println("Error");
				posalfilx=0;
		}
		
		int posalfily=Integer.parseInt(posalfil.substring(1))-1;
		
		int posx=posalfilx; int posy=posalfily;
		
			while(posx>-1&&posy>-1&&posx<8&&posy<8){
				switch(posx){
				case 0:
					posalfil="a";
					break;
				case 1:
					posalfil="b";
					break;
				case 2:
					posalfil="c";
					break;
				case 3:
					posalfil="d";
					break;
				case 4:
					posalfil="e";
					break;
				case 5:
					posalfil="f";
					break;
				case 6:
					posalfil="g";
					break;
				case 7:
					posalfil="h";
					break;
				default:
					System.out.println("Error");
					posalfilx=0;
				}
				if(!(posx==posalfilx&&posy==posalfily)) {
					System.out.print(" "+posalfil+(posy+1));
				}
				posx--; posy++;
			}
			posx=posalfilx; posy=posalfily;
			while(posx>-1&&posy>-1&&posx<8&&posy<8){
				switch(posx){
				case 0:
					posalfil="a";
					break;
				case 1:
					posalfil="b";
					break;
				case 2:
					posalfil="c";
					break;
				case 3:
					posalfil="d";
					break;
				case 4:
					posalfil="e";
					break;
				case 5:
					posalfil="f";
					break;
				case 6:
					posalfil="g";
					break;
				case 7:
					posalfil="h";
					break;
				default:
					System.out.println("Error");
					posalfilx=0;
				}
				if(!(posx==posalfilx&&posy==posalfily)) {
					System.out.print(" "+posalfil+(posy+1));
				}
				posx++; posy++;
			}
			posx=posalfilx; posy=posalfily;
			while(posx>-1&&posy>-1&&posx<8&&posy<8){
				switch(posx){
				case 0:
					posalfil="a";
					break;
				case 1:
					posalfil="b";
					break;
				case 2:
					posalfil="c";
					break;
				case 3:
					posalfil="d";
					break;
				case 4:
					posalfil="e";
					break;
				case 5:
					posalfil="f";
					break;
				case 6:
					posalfil="g";
					break;
				case 7:
					posalfil="h";
					break;
				default:
					System.out.println("Error");
					posalfilx=0;
				}
				if(!(posx==posalfilx&&posy==posalfily)) {
					System.out.print(" "+posalfil+(posy+1));
				}				
				posx--; posy--;
			}
			posx=posalfilx; posy=posalfily;
			while(posx>-1&&posy>-1&&posx<8&&posy<8){
				switch(posx){
				case 0:
					posalfil="a";
					break;
				case 1:
					posalfil="b";
					break;
				case 2:
					posalfil="c";
					break;
				case 3:
					posalfil="d";
					break;
				case 4:
					posalfil="e";
					break;
				case 5:
					posalfil="f";
					break;
				case 6:
					posalfil="g";
					break;
				case 7:
					posalfil="h";
					break;
				default:
					System.out.println("Error");
					posalfilx=0;
				}
				if(!(posx==posalfilx&&posy==posalfily)) {
					System.out.print(" "+posalfil+(posy+1));
				}
				posx++; posy--;
			}
			
			tablero[posalfilx][posalfily]=2;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(tablero[i][j]==1) {
					switch(i){
					case 0:
						posalfil="a";
						break;
					case 1:
						posalfil="b";
						break;
					case 2:
						posalfil="c";
						break;
					case 3:
						posalfil="d";
						break;
					case 4:
						posalfil="e";
						break;
					case 5:
						posalfil="f";
						break;
					case 6:
						posalfil="g";
						break;
					case 7:
						posalfil="h";
						break;
					default:
						System.out.println("Error");
						posalfilx=0;
					}
					System.out.print(" "+posalfil+(j+1));
				}
			}
		}
		
	}

}
