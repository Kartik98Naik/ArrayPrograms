//wajp to print only alternative elements only if it is odd?
package com.jsp.Array;

public class Arrayprintodd {
public static void main(String[] args) {
	int []a= {1,21,31,20,40,51,6,7};
	for(int i=0;i<a.length;i=i+2) {
		if(a[i]%2==1) {
			System.out.print(a[i]+" ");
		}
	}
}
}
