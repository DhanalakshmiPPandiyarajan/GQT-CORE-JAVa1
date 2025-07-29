package com.gqt.corejava.patterns1;
import java.util.*;
public class Newpattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			System.out.print("- ");
		}
		for(int k=1;k<=((2*i)-1);k++){		
		System.out.print("$ ");
		}
		System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
