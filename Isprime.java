import java.util.*;
class Isprime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();

		boolean Isprime = true;

		if(n == 2){
			System.out.println(n +" is Prime");
		}
		else{
			for(int i=2; i <= Math.sqrt(n); i++){
				if(n % i == 0){
					Isprime = false;
				}
			}

			if(Isprime == true){
				System.out.println(n +" is Prime");
			}
			else{
				System.out.println(n +" is not Prime");
			}
		}
	}
}