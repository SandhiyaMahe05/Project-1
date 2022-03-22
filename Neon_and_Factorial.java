package tamilnadu.chennai;

import java.util.Scanner;

public class Neon_and_Factorial {
	public static void main(String[] args) {
		Neon_and_Factorial bcp=new Neon_and_Factorial();
		bcp.neon();
		bcp.factorial();
	}
	private void factorial() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the number to find the factorial:");
		int num=sc.nextInt();
		int i =1;
		int rem = num%10;
		//System.out.println("rem is" +" "+rem);
		while(i>=1&&rem>1)
		{
			//if(rem>1) {
		i = i*rem;//1*5=5,5*4=20,20*3=60,60*2=120, 120*1=120
		rem--;//4         3        2       1       0
	    //System.out.println(i);
		}
	    System.out.println("Factorial of given number is:"+" "+ i);
		}

	private void neon() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is Neon number or not:");
		int num=sc.nextInt();
		int numFirst=num;
		num=num*num;
		System.out.println("Square of the given number"+" "+num);
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		sum = rem+ sum;
		System.out.print(rem+" ");
		num=num/10;
		}
		System.out.println();
		System.out.println("sum of the digits of square"+" "+ sum);
		if(sum==numFirst)
		{
			System.out.println(numFirst+" "+"is a neon number");
		}
		else
		{
			System.out.println(num+" "+"is not a neon number");
		}
	}

}
