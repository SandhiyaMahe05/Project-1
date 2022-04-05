package tamilnadu.chennai;

public class Star_Patterns1 {
	public static void main(String[] args) {
		Star_Patterns1 pat = new Star_Patterns1();
		 pat.starPat(); 
		 pat.starPat2();
		 pat.starpat3();
		 pat.starpat4();
		 pat.starpat5();
		 }
		 private void starpat5() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int star = 1; star < row; star++) {
				System.out.print("*");
			}
			// for(int col=5;col>=row;col--) {
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(1);
			}
			System.out.println();
		}

	}

	private void starpat4() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int star = 1; star < row; star++) {
				System.out.print("*");
			}
			for (int col = 1; col <= 3; col++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}

	private void starpat3() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col < row; col++) {
				System.out.print("*");
			}
			System.out.print(1);
			System.out.println();
		}
	}

	private void starPat2() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
			}
			System.out.println(1 + " ");
		}
	}

	private void starPat() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	}