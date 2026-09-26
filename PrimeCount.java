import java.util.*;
class PrimeCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n1:");
		int n1 = sc.nextInt();

		System.out.print("Enter n2:");
		int n2 = sc.nextInt();

		//check the number of prime numbers between n1 and n2

		int count = 0;

		for(int i = n1; i <= n2; i++){
			if(i < 2){
				continue;
			}

			boolean Isprime = true;

			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					Isprime = false;
					break;
				}
			}

			if(Isprime){
				count++;
			}
			
		}
		System.out.println(count +" prime numbers btw n1 and n2");
	}
}