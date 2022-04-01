package tamilnadu.chennai;

import java.util.Scanner;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		Decimal_To_Binary pro3 = new Decimal_To_Binary();
		pro3.decimalToBinary();
	}

	private void decimalToBinary() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find decimal:");
		int no=sc.nextInt();
		String binary="";
		while(no>0)//no=4 --> 4>0      2>0        1>0
		{
			binary=(no%2)+binary;//0+""="0", 0+"0"="00" , 1+"00"=100    concatenation
			no=no/2;	//2		1
		}
		System.out.println(binary);
	}
}
