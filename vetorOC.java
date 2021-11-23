package t;
import java.util.Scanner;
public class vetorOC {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i, lu, ii, j;
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite um número:");
			a[i] = ler.nextInt();
			b[i] = a[i];
		}
		for(i=0;i<TAM-1;i++) {
			lu = i;
			for(ii=i+1;ii<TAM;ii++) {
				if(b[ii]<b[lu]) {
					lu = ii;
				}
			}
			j = b[i];
			b[i] = b[lu];
			b[lu] = j;
		}
		for(i=0;i<TAM;i++) {
			System.out.println(b[i]);
		}
		ler.close();
	}
}

