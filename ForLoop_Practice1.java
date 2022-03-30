package tamilnadu.chennai;

import java.util.Scanner;

public class ForLoop_Practice1 {
	public static void main(String[] args) {
		ForLoop_Practice1 flp = new ForLoop_Practice1();
		flp.fibo();
		flp.neon();
		
	}

	private void neon() {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number you want to check:");
			int num=sc.nextInt();
			int numFirst=num;
			num=num*num;
			System.out.println("Square of the given number"+" "+num);
			int sum;
			for(sum=0;num>0;)
			{
			int rem=num%10;
			sum = rem+ sum;
			System.out.print(rem+" ");
			num=num/10;
			}
			System.out.println();
			System.out.println("sum of the digits of square value"+" "+ sum);
			if(sum==numFirst)
			{
				System.out.println(numFirst+" "+"is a neon number");
			}
			else
			{
				System.out.println(num+" "+"is not a neon number");
			}
		}


	private void fibo() {
		// TODO Auto-generated method stub
		int no1=0;
		int no2=1;
		int temp;
		for(temp=0;temp<13;)
		{
			temp=no1+no2;
			System.out.println(temp);
			no1=no2;
			no2=temp;
		}
	}

}
