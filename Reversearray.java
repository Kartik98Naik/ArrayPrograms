package com.jsp.Array;
public class Reversearray{
	public static void main(String[]args) {
		int []a= {1,6,66,7,17,5};
		int temp=0;
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]= a[a.length-1-i];
			a[a.length-1-i]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}