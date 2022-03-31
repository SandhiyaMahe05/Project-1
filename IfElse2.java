package tamilnadu.chennai;

import java.util.Scanner;

public class IfElse2 {
	public static void main(String[]args) {
	IfElse2 ws = new IfElse2();
	ws.admission();
  }
private void admission() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfAdmissions=3;
		String Name="anything";
		while(noOfAdmissions>0) 
		{
		System.out.println("Enter your name: ");
		String name= sc.next();
		Name=name;
		System.out.println("Enter board of 12th standard: ");
		String board =sc.next();
		System.out.println("Enter your 12th cutoff: ");
		int cutoff = sc.nextInt();
		if(cutoff>=160)
		 {
			System.out.println("Welcome"+" "+ name +" "+ "You can choose the department");
		 }
		else if(cutoff>=100)
		{
			System.out.println("Welcome"+" "+ name +" "+"We will suggest you the department");
		}
		else
		{
			System.out.println("Sorry"+""+name+ "your cutoff is not eligible");
		}
		noOfAdmissions--;
		}
		System.out.println("welcome");
		}
 
}
