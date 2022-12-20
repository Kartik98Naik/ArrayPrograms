//wajp to find 2nd largest element?
package com.jsp.Array;

public class Array2ndlarestelement {
public static void main(String[] args) {
	int[]a= {1,5,6,3,8,9};
	int max=a[0];
	int max1=a[1];
	for(int i=2;i<a.length;i++) {
		if(a[i]>max) {
			max1=max;
			max=a[i];
		}else if(a[i]>max1 && a[i]!=max) {
			max1=a[i];
		}
	}
	System.out.println(max);
	System.out.println(max1);
}
}
