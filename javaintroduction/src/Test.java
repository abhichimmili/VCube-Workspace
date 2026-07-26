
public class Test {
	
	static boolean isPrime(int num){
		if(num<=1) {
			return false;
		}
		if(num==2) {
			return true;
		}
		if(num%2==0) {
			return false;
		}
		for (int i = 3; i * i <= num; i += 2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n= 2315123;
		int t=10;
		//int temp1=n;
		int temp=n;
		int digits = String.valueOf(n).length();

		for (int k = 1; k <= digits; k++) {
		   
		//while (temp1>0) {
			while(n>t/10) {
				int rem=n%t;
				if(isPrime(rem)) {
					System.out.print(rem+" ");
				}
				n=n/10;
			}
			t=t*10;
			//temp1=temp1/10;
			n=temp;
		}
		
		
		
		
//		while(val>=condition) {
//			int req = val%digit;
//			if(isPrime(req)) {
//				System.out.println(req);
//			}
//			val=val/digit;
//		}
		
		
		
//		int a=10,b=20;
//		System.out.println("a :"+a+", b : "+b);
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("a :"+a+", b : "+b);
	}

}
