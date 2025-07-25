package com.gqt.corejava.patterns;
import java.util.Scanner;

public class patternprogram12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count:");
		int n=sc.nextInt();
		int a=n*n;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		
		System.out.print(a+ "	");
		a--;
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
}
