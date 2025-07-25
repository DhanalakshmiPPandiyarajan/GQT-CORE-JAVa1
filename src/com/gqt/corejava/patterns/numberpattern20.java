package com.gqt.corejava.patterns;
import java.util.Scanner;
public class numberpattern20 {

	public static void main(String[] args) {
		int rows=3;
		int columns=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int count;
		 for (int i = 0; i < rows; i++) {         // loop through rows
	     for (int j = 0; j < columns; j++) {     // loop through columns
	     if ((i + j) % 2 == 0) {
	     System.out.print("1 ");
	     } else {
	         System.out.print("0 ");
	        }
	    }
	         System.out.println();
		// TODO Auto-generated method stub

	}

}
}
