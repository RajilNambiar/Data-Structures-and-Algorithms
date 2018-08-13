package com.pro.src.algo;

public class TowerOfHanoi {

	public void move(int n, char A, char C, char B) {
		if (n == 1) {
			System.out.println("Moving disc 1 from " + A + " to " + C);
		} else {
			move(n - 1, A, B, C);
			System.out.println("Moving disc " + n + " from " + A + " to " + C);
			move(n - 1, B, C, A);
		}
	}

	public static void main(String args[]) {
		TowerOfHanoi TOH = new TowerOfHanoi();
		TOH.move(5, 'A', 'C', 'B');
	}
}
