//wajp to print the array element with reverse order alternatively only if it is even?
package com.jsp.Array;

public class Arrayrevorderodd {
public static void main(String[] args) {
	int[]a= {1,2,3,4,8,6,7,8,9,2};
	for(int i=a.length-1;i>=0;i=i-2) {
		if(a[i]%2==0) {
			System.out.print(a[i]+" ");
		}
	}
}
}
