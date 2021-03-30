//Write a program to calculate the sum of the digits of a 3-digit number

import java.util.*;
class q15_sum_of_digit {
 public static void main(String agr[])
    {
	Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        System.out.println("Sum of digits "+sum);
    }
}
 