
public class primenum {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		for(int i=1;i<=a;i++) {
			b=a%i;
		}
		if(b==2) {
			System.out.println("prime number");
		}
		else{System.out.println("not a prime number");
		}
	}

}
