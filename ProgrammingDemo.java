package tamilnadu.chennai;

import java.util.Scanner;

public class ProgrammingDemo {
	public static void main(String[]args)
	{
		ProgrammingDemo pd = new ProgrammingDemo();
		pd.learn_if();
		pd.learn_if2();
		pd.loop_learning();
		pd.worship();
		pd.goldProgram();
		pd.getInputFromUser();
		
	}
	
	
	private void getInputFromUser() {
		Scanner sc=new Scanner(System.in);
		int total=0;
		int subject = 5;
		while(subject>0)
		{
			System.out.println("Enter the marks:");
			int mark = sc.nextInt();
			total=total+mark;
			subject--;
		}
		System.out.println(total);
		
	}
	private void goldProgram()
	{
		int day=1;
		int gold=1;
		int total=0;
		
		 while(day<=7)
		 {
			gold=gold*2;
			//System.out.println(gold);
			day=day+1;
			total = total+gold;
	        System.out.println(gold);
		}
		 System.out.println("Total is:"+" "+total);
	}
	private void loop_learning()
	{
		int purse = 0;
		int day = 1;
		while(day<=5)
		{
			purse = purse+day;
			System.out.println(purse);
			day=day+1;
		}
	}
	private void worship()
	{
		int flower=1024;
		int temple=0;
		while(flower>0)
		{
			flower=flower/2;
		     temple=temple+1;
		}
		     System.out.println("He visited"+" "+temple+" "+"temples.");
		
	}
	public void learn_if2()
	{
		int amount = 120;
		int petrol = 104;
		if(amount>100)
		{
			if(petrol==104)
			{
			System.out.println("Fill petrol");
		    }
			else
			{
				System.out.println("only half litre");
			}
		}
		else
		{
			System.out.println("No petrol today");
		}
		
	}
	public void learn_if()
	{
		int no1 =5, no2=55;
		if(no1>no2)
			{
			System.out.println(no1);
			}
		else if(no2>no1)
		{
			System.out.println(no2);
		}
		else//else
		{
			System.out.println(no1+" "+no2);
		}
	}
}
	