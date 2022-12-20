package com.jsp.Array;
public class Diffsum{
	public static void main(String[]args) {
		int sumo=0;
		int sume=0;
		int [] a= {1,6,66,7,17,5};
		
		
		for(int i=0; i< a.length; i++) {
			if(a[i]%2 ==0) {
				sume= a[i]+sume;
			}
			if(a[i]%2!=0) {
				sumo=a[i]+sumo;
				
			}
			
		}
		System.out.println(sume-sumo);
}

	
	
}