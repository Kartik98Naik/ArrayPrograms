//wajp to print smallest element in an Array?
package com.jsp.Array;

public class Arraysmallestelement {
public static void main(String[] args) {
	int[]a= {2,6,4,8,9,60,1};
	int min=a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println(min);
}
}
