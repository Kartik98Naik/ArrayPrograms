//wajp to know how many two digit no are there in an array?
package com.jsp.Array;

public class Arraycountdigit {
public static void main(String[] args) {
	int[]a= {1,20,4,333,5,69,46,373};
	
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>9 && a[i]<100) {
			count++;
		}
	}
	System.out.println(count);
}
}
