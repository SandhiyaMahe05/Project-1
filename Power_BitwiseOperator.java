package tamilnadu.chennai;

import java.util.Scanner;

public class Power_BitwiseOperator {
	public static void main(String[] args) {
		Power_BitwiseOperator bps = new Power_BitwiseOperator();
		bps.swapBy_XOR();
		bps.bits();
		bps.Thenali();
		bps.power1();
		bps.divisor();
	}
	private void divisor() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to finds it's divisors:");
		int no=sc.nextInt();
		int div = 1;
		System.out.println("The divisors of given number is:");
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
			}
				div++;
		}
	}

	private void power1() {
		// TODO Auto-generated method stub
		int power=1;
		while(power<=4)
		{
			double result= Math.pow(4, power);
			System.out.println(result);
			power++;
		}
	}

	private void Thenali() {
		// TODO Auto-generated method stub
		int gift=256;
		int securitycount=0;
		while(gift>0)
		{
			System.out.println(gift/2);
			gift=gift/2;
			securitycount++;
		}
		System.out.println("The number securities got the gift is:"+" "+securitycount);
	}

	private void bits() {
		// TODO Auto-generated method stub
		int no1=5;
		int no2=3;
		System.out.println("XOR value:");
		System.out.println(no1^no2);
		System.out.println("Right shift value of no1:");
		System.out.println(no1>>2);
		System.out.println("Left shift value of no2:");
		System.out.println(no2<<3);
	}

	private void swapBy_XOR() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number for swapping");
		int no1=sc.nextInt();
		System.out.println("Enter the second number for swapping");
		int no2=sc.nextInt();
		no1=no1^no2;
		no2=no1^no2;
		no1=no1^no2;
		System.out.println("After swap using XOR operator the first number is :"+" "+no1);
		System.out.println("After swap using XOR operator the second number is :"+" "+no2);
	}
}
	
