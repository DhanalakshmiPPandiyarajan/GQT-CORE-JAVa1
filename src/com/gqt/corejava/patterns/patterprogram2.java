package com.gqt.corejava.patterns;
import java.util.Scanner;
public class patterprogram2 {
 
    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size:");
	 int n=sc.nextInt();
	 int c=1;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print(c +" " );
		c++;			
	}
		System.out.println();
				}
		// TODO Auto-generated method stub

	}

}

