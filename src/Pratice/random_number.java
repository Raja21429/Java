package Pratice;

public class random_number {

	public static void main(String[] args) {
		
//		double s = Math.floor(Math.random()*10+6);
//		System.out.println((int)s);
		int n=6;
		for(int i=1;i<=n;i++) {
			double s = Math.random()*10;
			System.out.print(" "+(int)s);
		}

	}

}
