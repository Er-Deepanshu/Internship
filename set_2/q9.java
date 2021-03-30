//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

import java.util.*;
class q9{
	public static void main(String agr[]){
	int a=78;
	int b=45;
	int c=62;
	double total=a+b+c;
	double max=300;
	double percentage=((total/max)*100);
	System.out.println("Total marks of Robert is  "+total);
	System.out.println("Percentage of Robert is  "+percentage);
	}
}