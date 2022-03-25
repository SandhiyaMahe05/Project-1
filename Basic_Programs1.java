package tamilnadu.chennai;

import java.util.Scanner;

public class Basic_Programs1 {
	public static void main(String[] args) {
		Basic_Programs1 bcp=new Basic_Programs1();
		bcp.multiplicationOfNumber();
		bcp.palindromNumber();
		bcp.armstrongNumber();
	}

	private void armstrongNumber() {
		// TODO Auto-generated method stub
		int num = 153;
		int num2=num;
		int count=0;
		int arm=0;
		while(num>0)
		{
			int rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
			count++;
		}
		if(num2==arm)
		{
		System.out.println("The given number is Armstrong Number");
		}
		else
		{
			System.out.println("The given number is not Armstron number");
		}
	}

	private void palindromNumber() {
		// TODO Auto-generated method stub
		int num = 343;
		int num2=num;
		int count=0;
		int reverse=0;
		while(num>0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
			count++;
		}
		if(num2==reverse)
		{
		System.out.println("The given number is palindrom");
		}
		else
		{
			System.out.println("The given number is not palindrom");
		}
	}

	private void multiplicationOfNumber() {
		int mult=1;
		int num=1;
		while(num<=5)
		{
			mult = mult*num;
			num++;
		}
		System.out.println("Multiplication of the number 5 is:"+" "+mult);
	}

}

	