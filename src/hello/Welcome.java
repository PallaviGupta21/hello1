package hello;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter string : ");
     Scanner sc=new Scanner(System.in);
     String a=sc.next();
     System.out.println("your string is : "+a);
     sc.close();
     System.out.println("hello");
	}
 
 
}