package tamilnadu.chennai;

import java.util.Scanner;

public class NestedLoop_PatternPrograms{
	public static void main(String[] args) {
		NestedLoop_PatternPrograms nsl = new NestedLoop_PatternPrograms();
		
		nsl.nestedloop1();
		nsl.nestedloop2();
		nsl.nestedloop3();
		nsl.nestedloop4();
		nsl.nestedloop5();
		nsl.nestedloop6();
		nsl.nestedloop7();
	}
	private void nestedloop7() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row*col+" "); 
				
			}
			System.out.println();
		}
	}

	private void nestedloop6() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");//row*col=5 10 15 20 25         4 8 1 16     3 6 9 
				
			}
			System.out.println();
		}
	}

	private void nestedloop5() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void nestedloop4() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=3;row>0;row--)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void nestedloop3() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=1;row<=3;row++) 
		{
			for(int col=5;col>0;col--) 
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void nestedloop2() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for (int row=1;row<=3;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void nestedloop1() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int no = 1; no<=3;no++)
		{
			for(int count=1;count<=4;count++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}
}