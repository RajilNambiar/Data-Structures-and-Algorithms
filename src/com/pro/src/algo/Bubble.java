package com.pro.src.algo;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {12,3,20,14,1,5,8,9,4,2};

		Bubble sort = new Bubble();
		sort(data);
		System.out.println(Arrays.toString(data));
	}
	

	public static void sort(int[] data) {
		int tmp;
		for(int i =0; i< data.length - 1;i++) {
			for(int j=0; j < data.length - 1; j++) {
				if (data[j] > data[j+1]) {
					tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}
				
			}
		}
	}

}

