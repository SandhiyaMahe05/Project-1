package tamilnadu.chennai;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		SquareRoot sqrt = new SquareRoot();
		sqrt.squareRoot();
	}
private void squareRoot() {
		// TODO Auto-generated method stub
		int no =25;
		int sqr = 1;
		while(sqr<50)
		{
			if(no/sqr==sqr)
			{
				System.out.println(sqr);
				break;
			}
			sqr++;
		}
	}
	}