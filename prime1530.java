package com.java.pack;


public class prime1530 {
	public static void main(String args[]){
		
		
		
		for(int n=15; n<=30 ;n++){
			boolean temp = true;
			
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					temp = false;
					break;
				}
			}
			if(temp) {
				System.out.print(n+" ");
			}
		}
}
}