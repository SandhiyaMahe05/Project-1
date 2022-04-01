package tamilnadu.chennai;

import java.util.Scanner;

public class Binary_To_Decimal {
	public static void main(String[] args) {
		Binary_To_Decimal pro3 = new Binary_To_Decimal();
		pro3.binaryToDecimal();
	}

	private void binaryToDecimal() {
		// TODO Auto-generated method stub
		int no=101;
		int po=0;
		int rem=0;
		while(no>0)  //101>0 , 10>0  , 1>0  
		{
			int power=powerLogic2(2,po);// 1  2  4
			int mod=no%10; // 1  0  1
			no=no/10;    // 10   1   0
			rem=rem+(power*mod);// 0+(1*1)=1 , 1+(2*0)=1 , 1+(4*1)=5
			po++;//1  2  
		}
		System.out.println("The Decimal is"+" "+rem);
	}

	private void decimalToBinary() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find decimal:");
		int no=sc.nextInt();
		String binary="";
		while(no>0)//if no=4 --> 4>0      2>0        1>0
		{
			binary=(no%2)+binary;//0+""="0", 0+"0"="00" , 1+"00"=100    concatenation
			no=no/2;	//2		1
		}
		System.out.println(binary);
	}

	private int powerLogic2(int base, int exp) {
		// TODO Auto-generated method stub
		int result = 1;
		while(exp>0)
		{
			result = result * base;
			exp--;
		}
		return result;
	}
}