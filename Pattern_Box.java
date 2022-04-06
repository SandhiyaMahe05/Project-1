package tamilnadu.chennai;

public class Pattern_Box {
	public static void main(String[] args) {
		Pattern_Box pb = new Pattern_Box();
		pb.pat1();
		pb.pat2();
	}

	private void pat2() {
			// TODO Auto-generated method stub
			for (int row = 1; row <= 9; row++) {
				if (row == 1 || row==5||row==9) {
			    //  if (row == 1 || row==5) {
					for (int star = 1; star <= 7; star++) {
						System.out.print("*  ");
					}
				} else {
					System.out.println("*");
				}
				System.out.println();
			}
	}

	private void pat1() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 10; row++) {
			if (row == 1 || row == 10) {
				for (int star = 1; star <= 7; star++) {
					System.out.print("*  ");
				}
			} else {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
