package tamilnadu.chennai;

import java.util.Scanner;

public class NumberPuzzles {
	public static void main(String[]args) {
	NumberPuzzles ws = new NumberPuzzles();
	
	ws.oddNo();
	ws.evenNo();
	ws.table3();
	ws.fourTimes();
	ws.puzzle1();
	ws.cubeRootPuzzle();
	ws.squareRoot();
	ws.naturalNumbers();
	}
	private void naturalNumbers() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("");
		System.out.println("Natural numbers");
		while(no<=10)
		{
			System.out.print(no++  +" ");
		}
	}

	private void squareRoot() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("");
	    System.out.println("Square root");
		while (no<=5)	
		{
		System.out.print(no*no + " ");
		no++;
	}
	}

	private void fourTimes() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("");
		System.out.println("4 times table series");
		while(no<=40)
		{
			int temp=no%4;
			if(temp==0) {
				
			System.out.print(no);
			System.out.print(" ");
			}
			no++;
		}
	}

	private void cubeRootPuzzle() {
		// TODO Auto-generated method stub
		int num=6;
		int i=1;
		System.out.println("");
		System.out.println("Cube root");
		while(i<=num)
		{
			System.out.print(i*i*i);
			System.out.print(" ");
			i++;
		}
			
	}

	private void puzzle1() {
		// TODO Auto-generated method stub
		int sequence = 1;
		int n=8;
		System.out.println("");
		System.out.println("puzzle 1");
		while(n!=0)
		{
			//System.out.println(sequence);
			sequence=sequence*2;
			System.out.print(sequence);
			System.out.print(" ");
			n--;
		}
	}

	private void table3() {
		// TODO Auto-generated method stub
		int no = 1;
		System.out.println("");
		System.out.println("3 table series");
		while(no<=30)
		{
			int temp=no%3;
			if(temp==0)
			{
				System.out.print(no);
				System.out.print(" ");
			}
			no++;
		}
	}

	private void evenNo() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("");
		System.out.println("Even numbers");
		while(no<=10)
		{
			int temp=no%2;
			if(temp==0) 
			{
				System.out.print(no);
				System.out.print(" ");
			}
			no++;
		}
	}

	private void oddNo() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("odd numbers");
		while(no<=10)
		{
			int temp=no%2;
			if(temp!=0) {
			System.out.print(no);
			System.out.print(" ");
			}
			no++;
		}
	}
}