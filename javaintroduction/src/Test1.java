
public class Test1 {

	public static void main(String[] args) {
		int arr[]= {121,222,152,172};
		int count=0;
		int condition=8;
		for(int a:arr) {
			int temp=a;
			while(temp>0) {
				int d= temp%10;
				if(d==condition) {
					count++;
				}
				temp=temp/10;
			}
		}
		if(count==0) {
			System.out.println("No occurance of the digit : "+condition);
		}else {
			System.out.println(count);
		}
	}

}
