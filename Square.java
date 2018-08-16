/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,n3,n4,n5,n6,n7,n8;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		n4=s.nextInt();
		n5=s.nextInt();
		n6=s.nextInt();
		n7=s.nextInt();
		n8=s.nextInt();
		if(n1==n2&&n5==n6&&n3==n8&&n4==n7)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		
	}
}
