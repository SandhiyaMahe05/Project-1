package tamilnadu.chennai;

public class IfElsePrograms {
	public static void main(String[]args) {
	IfElsePrograms examples = new IfElsePrograms();
	examples.penPencil();
	examples.operators();
	examples.greaterNum();
	examples.freshJuiceCorner();
	}
	
	public void penPencil() {
		int amount = 5;
		if(amount>10)
		{
			if(amount==60) 
			{
			    System.out.println("You can buy Ink pen");
			}
			else if(amount==15)
			{
				System.out.println("You can buy Gel pen");
			}
			else
			{
				System.out.println("you can buy pencil");
		    }
		}
		else
		{
			System.out.println("Sorry you cannot buy pen or pencil");
		}
			
				
		}
	public void operators()
	{
		int num = 60;
	    if(num>=50)
		{
			num++;
			System.out.println(num);
		}
	}
	public void greaterNum()
	{
		int num=150;
		
		if(num==100)
		{
			System.out.println("equal to 100");
		}
		else if (num<50)
		{
			System.out.println("Smaller than 50"+num); 
		}
		else
		{
			if(num>100)
			{
			System.out.println("greater than 100" +" "+ "the given number is"+"  "+num);
			}
		}
			
		}
	public void freshJuiceCorner()
	{
		int amount = 60;// customer kondu vara money
		if(amount==50)
		{
			System.out.println("Orange juice");
		}
		else if(amount>150)
		{
			System.out.println("you can buy any juice");
		}
		else
		{
			System.out.println("chocolate milk shake");
		}
	}
}
	