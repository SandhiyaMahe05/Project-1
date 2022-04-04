package tamilnadu.chennai;

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) {
		PrimeNumber prn = new PrimeNumber();
		prn.primeNumber();
	}
private void primeNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int div = 2;
		boolean prime = true;
		while (no > div) {

			if (no % div == 0) {
				System.out.println("Not Prime number");
				prime=false;
				break;
			}
			div++;
		}
		if(prime==true)
			System.out.println("The given number "+no+" is Prime number");
	}
}
