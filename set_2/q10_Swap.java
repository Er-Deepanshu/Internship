import java.util.*;
class q10_Swap{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st value");
	int a=sc.nextInt();
	System.out.println("enter 2nd value");
	int b=sc.nextInt();
	int c=0;
	System.out.println("Before swapping Using 2 variable : a, b = "+a+", "+ + b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After swapping : a, b = "+a+", "+ + b);
	System.out.println("Before swapping Using 3 variable : a, b = "+a+", "+ + b);
	c = a;
    	a = b;
    	b = c;
	System.out.println("After swapping : a, b = "+a+", "+ + b);
  }
}