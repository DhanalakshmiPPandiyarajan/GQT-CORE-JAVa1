package com.gqt.corejava.patterns;
import java.util.Scanner;
public class ReverseNumberPyramid21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
		  System.out.print(i+ " ");
		}
		System.out.println();
		}
		// TODO Auto-generated method stub

	}

}

