package com.pro.src.algo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch binary = new BinarySearch();
		binarySearch(2);
		System.out.println();
	}

	private static Integer[] data;
	
	private static int size() {
		int i = 0;
		while ((i < data.length) && (data[i] != null)) {
			i++;
		}
		return i;
	}
	public static int binarySearch(int item) {
		int maxIndex = size()-1;
		int minIndex = 0;
		int indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);
		while ((data[indexToLook] != item) && (maxIndex > minIndex)) {
			if (data[indexToLook] > item) { // case to search on the left
				maxIndex = indexToLook - 1;
			} else {
				minIndex = indexToLook + 1;
			}
			indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);
		}
		if (data[indexToLook] == item) return indexToLook;
		return -1;
	}
	
}
