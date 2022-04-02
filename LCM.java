package tamilnadu.chennai;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		LCM pro3 = new LCM();
		pro3.lcm();
	}
	private void lcm() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int no1=sc.nextInt();
		System.out.println("Enter the number 2:");
		int no2=sc.nextInt();
		int big=no1>no2?no1:no2;
		while(true)
		{
			if(big%no1==0&&big%no2==0)
			{
				System.out.println("LCM"+" "+big);
				break;
			}
		big++;
		}
	}
}