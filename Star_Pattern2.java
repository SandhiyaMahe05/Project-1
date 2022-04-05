package tamilnadu.chennai;

public class Star_Pattern2 {
	public static void main(String[] args) {
		Star_Pattern2 pat = new Star_Pattern2();
		 pat.starpat6();
		 pat.starpat6_1();
		 pat.starpat7();
	}
	private void starpat7() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int star = 4; star >= row; star--) {
				System.out.print("*");
			}
			for (int no = 1; no <= row; no++) {
				System.out.print(no);

			}
			System.out.println();
		}
	}

	private void starpat6_1() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 5; row++) {
			for (int space = 5 - row; space > 0; space--) {
				System.out.print(" ");
			}
			for (int no = 1; no <= row; no++) {
				System.out.print(no);
			}
			System.out.println();
		}

	}

	private void starpat6() {
		// TODO Auto-generated method stub
		for (int row = 5; row >= 1; row--) {
			for (int star = 1; star < row; star++) {
				System.out.print(" ");
			}
			// for(int col=5;col>=row;col--) {
			for (int col = 1; col <= 6 - row; col++) {
				// System.out.print(row+" ");//or
				// System.out.print(1+" ");//or
				System.out.print(col);
			}
			System.out.println();
		}

	}
}