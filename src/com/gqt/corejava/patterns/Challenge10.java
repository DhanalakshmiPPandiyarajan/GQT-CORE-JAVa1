package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		for (int i=n;i>=1;i--) {
            for (int s=1;s<=n-i;s++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            for (int k=i-1;k>=1;k--) {
                System.out.print(i + " ");
            }
            System.out.println();
		}
		for (int i=1;i<=n;i++) {
            for (int s=1;s<=n-i;s++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            for (int k=i-1;k>=1;k--) {
                System.out.print(i + " ");
            }
            System.out.println();
		}
	}

}
		