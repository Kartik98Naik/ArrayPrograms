//wajp to add only even number in an array?
package com.jsp.Array;

public class Arrayaddevenno {
public static void main(String[] args) {
	int[]a= {2,5,4,4,7,3,2,2,2,2,2,1};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
}
}
