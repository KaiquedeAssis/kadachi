package t;
import java.util.Scanner;
public class vetorP {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, c;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite um número:");
			a[i] = ler.nextInt();
		}
		for(i=0, c=0; i<TAM; i++) {
			if(a[i]==a[9-i]) {
				c++;
			}
		}
		if(c==10) {
			System.out.println("É um palindromo.");
		}else {
			System.out.println("Não é um palindromo.");
		}
		ler.close();
	}
}

