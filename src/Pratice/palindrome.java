package Pratice;

public class palindrome {

	public static void main(String[] args) {
		
		
		int rem,sum = 0,temp;
		
		int num = 121;
		temp = num;
		
		
		while(num != 0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);
		if(temp == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
	}

}
