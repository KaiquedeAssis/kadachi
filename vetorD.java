package t;
import java.util.Scanner;
public class vetorD {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i, ii;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite um n�mero inteiro (Grupo a):");
			a[i] = ler.nextInt();
		}
		for(ii=0;ii<1;ii++) {
			for(i=0;i<TAM;i++) {
				System.out.println("Digite um n�mero inteiro (Grupo b):");
				b[ii] = ler.nextInt();
				if(a[i]!=b[ii]) {
					c[i] = a[i];
				}
			}
		}
		System.out.print("\n Diferen�a entre o grupo a e b: ");
		for(i=0;i<TAM;i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}
		ler.close();
	}


	}


