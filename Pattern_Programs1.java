package tamilnadu.chennai;

public class Pattern_Programs1 {
	public static void main(String[] args) {
		Pattern_Programs1 pat = new Pattern_Programs1();
		 pat.pattern1();
		 pat.pattern2();
		 pat.pattern3();
		pat.pattern4();
		}

	private void pattern4() {
		// TODO Auto-generated method stub
		int end=1;
		for(int row=1;row<=5;row++) {
			for (int col = row; col <= end; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
			end=end+2;
		}
	}
	private void pattern3() {
		// TODO Auto-generated method stub
		int row = 1;
		for (row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		int row = 1;
		for (row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
				col++;
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		int row = 1;
		for (row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

}
