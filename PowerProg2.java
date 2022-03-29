package tamilnadu.chennai;

import java.util.Scanner;

public class PowerProg2 {
	public static void main(String[] args) {
		PowerProg2 pp2 = new PowerProg2();
				   
		int po=0;
		while(po<=5)
		{
		int output=pp2.powerLogic2(2,po);
		System.out.println(output);
		po++;
		}
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
