package t;
import java.util.Scanner;
public class vetorF {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i, f, n;
		final int TAM = 15;
		a = new int [TAM];
		b = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite um número:");
			a[i] = ler.nextInt();
			f = 1;
			for(n=a[i];n>1;n--) {
				f = f*n;
				b[i] = f;
			}
		}
		for(i=0;i<TAM;i++) {
			if(b[i]!=0) {
				System.out.println("O fatorial de "+a[i]+" é "+b[i]+".");
			}else {
				System.out.println("O fatorial de "+a[i]+" é 1.");
			}
		}
		ler.close();
	}
}

