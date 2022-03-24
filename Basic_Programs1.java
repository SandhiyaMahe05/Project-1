package tamilnadu.chennai;

import java.util.Scanner;

public class Basic_Programs1 {
	public static void main(String[] args) {
		Basic_Programs1 bcp=new Basic_Programs1();
		//bcp.neon();
		//bcp.factorial();
		//bcp.multiplicationOfNumber();
		bcp.strongNumber();
		//bcp.palindromNumber();
		//bcp.armstrongNumber();
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

	private void strongNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int num = sc.nextInt();
		int num2=num;
		int i =1;
		int total=0;
		while(num>0)
		{
		int rem = num%10;
		//System.out.println("rem is" +" "+rem);
		while(i>=0&&rem>1)
		{
			//if(rem>1) {
		i = i*rem;//1*5=5,5*4=20,20*3=60,60*2=120, 120*1=120
		rem--;//4         3        2       1       0
	    //System.out.println(i);
		}
	    System.out.println("Factorial of given number is:"+" "+ i);
	    total=total+i;
	    i=1;
	    num=num/10;
		}
		System.out.println("Sum of factorial of the digits is:"+" "+total);
		if(total==num2) {
			System.out.println("The sum of the factorial of given number's digits is equal to the number itself");
		    System.out.println(" So the given is strong number");
		    }
		    else
		    {
		    	System.out.println("The given number is not a strong number");
		    }
		/*int n,i;
		int fact_n,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		n = sc.nextInt();
		int total = 0;
		int temp_n = n;
		while(n != 0)
		{
		i = 1;
		fact_n = 1;
		lastdig = n % 10;
		while(i <= lastdig)//5   //4
		{
		fact_n = fact_n * i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
		i++;//2                    3      4     5     6 so break
		}
		total = total + fact_n;//0+5=5
		n = n / 10;//145/10=14;
		}
		if(total == temp_n)
		System.out.println(temp_n + " is a strong number\n");
		else
		System.out.println(temp_n + " is not a strong number\n");
		System.out.println();
		}*/
	
}
		
		//System.out.println(i);

	private void multiplicationOfNumber() {
		int mult=1;
		int num=1;
		while(num<=5)
		{
			mult = mult*num;//1  2  6
			num++;//2  3  4
		}
		System.out.println(mult);
	}

	private void factorial() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
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
		System.out.println("Enter the number you want to check:");
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

}
