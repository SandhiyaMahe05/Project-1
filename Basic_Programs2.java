package tamilnadu.chennai;

import java.util.Scanner;

public class Basic_Programs2 {
	public static void main(String[] args) {
		Basic_Programs2 bps = new Basic_Programs2();
		bps.fibo();
		bps.swappingWithout3rdVariable();
		bps.swappingWith3rdVariable();
	}

	private void swappingWith3rdVariable() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping, first number is:"+ "  "+num1);
		System.out.println("After swapping, second number is:"+"  "+num2);
	}

	private void swappingWithout3rdVariable() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1= sc.nextInt();
		System.out.println("enter the second number");
		int num2= sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping,The 1st number is:"+"  "+num1);
		System.out.println("After swapping,The 2nd number is: "+"  "+num2);
	}

	private void fibo() {
		// TODO Auto-generated method stub
		int f = -1, s = 1,t = 0;
		while(t<13)
		{
			t=f+s;
			System.out.println(t);
			f = s;
			s = t;
		}
	}

}
