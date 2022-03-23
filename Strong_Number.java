package tamilnadu.chennai;

import java.util.Scanner;

public class Strong_Number {
	public static void main(String[] args) {
		Strong_Number bcp=new Strong_Number();
		bcp.strongNumber();
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
		while(i>=0&&rem>1)
		{
		i = i*rem;
		rem--;
		}
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
			}
			}