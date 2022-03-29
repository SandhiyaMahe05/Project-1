package tamilnadu.chennai;

import java.util.Scanner;

public class PowerProg {
	public static void main(String[] args) {
		PowerProg pp = new PowerProg();
		pp.powerLogic();
		pp.powerMath();
	}

	private void powerLogic() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find power");
		int base =sc.nextInt();
		System.out.println("Enter the power value");
		int exp=sc.nextInt();
		int result=1;
		while(exp>0)
		{
			result = result*base;
			exp--;
		}
		System.out.println("The result is:"+" "+result);
	}
	private void powerMath() {
		// TODO Auto-generated method stub
		int power=1;
		while(power<=4)
		{
			double result= Math.pow(4, power);
			System.out.println(result);
			power++;
		}
	}
}
