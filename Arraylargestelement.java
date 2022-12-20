//wajp to print largest number?
package com.jsp.Array;

public class Arraylargestelement {
public static void main(String[] args) {
	int []a= {1,5,8,2,9,3,4};
	int max=a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
