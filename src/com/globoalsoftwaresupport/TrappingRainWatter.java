package com.globoalsoftwaresupport;

public class TrappingRainWatter {
	
	public static void main(String[] args) {
		//int[] a = {4,1,3,1,5};
		//int[] a = {2,1,3,1,4};
		//int[] a = {2,3,3,3,4};
		//int[] a = {2,1,3,1,4};
		//int[] a = {1,0,2,0,3,1,0,4};
		int[] a = {1,0,2,1,3,1,2,0,3};
		int sum = 0;
		
		for (int i = 1; i < a.length-1; i++) {
			sum = sum + calc(i,a);
		}
		
		System.out.println(sum);
		
	}


	private static int calc(int i, int[] a) {
		int right = a[i+1];
		int left = a[i-1];
		
		for (int j = i+1; j < a.length; j++) {
			if(right<a[j]) {
				right = a[j];
			}
		}
		for (int j = i-1; j >=0 ; j--) {
			if(left<a[j]) {
				left = a[j];
			}
		}
		
		
		int m = right>left ? left : right;
		return m-a[i]>0?m-a[i]:0;
	}
	}
