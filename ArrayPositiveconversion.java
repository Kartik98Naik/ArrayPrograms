//wajp to make a array positive?
package com.jsp.Array;

public class ArrayPositiveconversion {
public static void main(String[] args) {
	int[]a= {-1,2,3,-4,5,3,2,-1};
	for(int i=0;i<a.length;i++) {
		if(a[i]<0) {
			a[i]=a[i]*-1;
		}
	}
	for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}
}
}
