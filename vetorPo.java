package t;

public class vetorPo {
	public static void main(String[] args) {
		int a[], i=0, ii, res;
		final int TAM = 11;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			res=1;
			for(ii=0;ii<i;ii++) {
				res = 2*res;
				a[i] = res;
			}
		}
		for(i=0;i<TAM;i++) {
			System.out.println("a["+i+"] = "+a[i]+"\n");
		}
	}

}

