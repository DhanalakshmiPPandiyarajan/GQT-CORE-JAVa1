/**
 * 
 */
package com.gqt.corejava.patterns1;
import java.util.Scanner;
/*
*     *    
*    *     
*   *      
*  *       
* *        
**         
* *        
*  *       
*   *      
*    *     
*     * 
 */

/**
 * 
 */

public class AlphabetK11 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(j==0||i+j==mid+1||(i-j==mid-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
