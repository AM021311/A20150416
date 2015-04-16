//兩數相加

import java.util.Scanner;

public class Math_Sum{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,sum;
		

		System.out.println("第一個數:");
		num1=input.nextInt();

		System.out.println("第二個數:");
		num2=input.nextInt();

		sum=num1+num2;
		System.out.println("總和:"+(sum));

	}
	    }

