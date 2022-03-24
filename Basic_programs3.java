package tamilnadu.chennai;

import java.util.Scanner;

public class Basic_programs3 {
	public static void main(String[] args) {
		Basic_programs3 pro3 = new Basic_programs3();
		pro3.gcd1();
		pro3.gcd(100,150);
	}

	private void gcd(int no1, int no2) {
		// TODO Auto-generated method stub
		int div =2;
		int small=no1<no2?no1:no2;
		int last=0;
		while(div<small)
		{
			if(no1%div==0 && no2%div==0)
			{
				last=div;
			}
			div++;
		}
		System.out.println("GCD "+ last);
	}

	private void gcd1() {
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no1=sc.nextInt();
		System.out.println("Enter the Number");
		int no2=sc.nextInt();
		int gcd=1;
		int i=1;
		while(i<=no1&&i<=no2)
		{
			if(no1%i==0&&no2%i==0)
			{
				gcd=i;
			}
			i++;
		}
		System.out.println("The Greatest Common Divisor of given numbers is:"+" "+gcd);
		}
	}
