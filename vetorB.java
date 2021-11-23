package t;
import java.util.Scanner;
public class vetorB {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b=0, i, r=0;
		final int TAM = 10;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite um número:");
			a[i] = ler.nextInt();
		}
		System.out.println("Digite o número a ser buscado:");
		b = ler.nextInt();
		for(i=0;i<TAM;i++) {
			if(a[i]==b) {
				r = 1;
			}
		}
		if(r==1) {
			System.out.println("O número "+b+" está dentro do vetor.");
		}else {
		System.out.println("O número "+b+" não está dentro do vetor.");
		}
		ler.close();
	}

}
