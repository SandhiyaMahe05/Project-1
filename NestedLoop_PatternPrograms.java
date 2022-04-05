package tamilnadu.chennai;

import java.util.Scanner;

public class NestedLoop_PatternPrograms{
	public static void main(String[] args) {
		NestedLoop_PatternPrograms nsl = new NestedLoop_PatternPrograms();
		
		nsl.nestedLoop1();
		nsl.nestedLoop2();
		nsl.nestedLoop3();
		nsl.nestedLoop4();
		nsl.nestedLoop5();
		nsl.nestedLoop6();
		nsl.nestedLoop7();
	}
	private void nestedLoop7() {
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

	private void nestedLoop6() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");
				
			}
			System.out.println();
		}
	}

	private void nestedLoop5() {
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

	private void nestedLoop4() {
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

	private void nestedLoop3() {
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

	private void nestedLoop2() {
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

	private void nestedLoop1() {
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
